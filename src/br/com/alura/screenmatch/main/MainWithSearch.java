package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.exceptions.YearConversionErrorException;
import br.com.alura.screenmatch.models.MovieOmdb;
import br.com.alura.screenmatch.models.Title;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        String search = "";
        List<Title> titles = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!search.equalsIgnoreCase("sair")) {
            System.out.println("Type the movie to search: ");
            search = input.nextLine();


            if (search.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                String apiKey = "3cc7e0de";
                String address = "http://www.omdbapi.com/?t=" + search + "&apikey=" + apiKey;
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(address))
                        .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                MovieOmdb myTitleOmdb = gson.fromJson(json, MovieOmdb.class);
                System.out.println(myTitleOmdb);

                Title myTitle = new Title(myTitleOmdb);
                System.out.println("Converted title");
                System.out.println(myTitle);

                titles.add(myTitle);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (YearConversionErrorException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titles);
        FileWriter writer = new FileWriter("filmes.json");
        writer.write(gson.toJson(titles));
        writer.close();
        System.out.println("The program has finished correctly!");
    }
}

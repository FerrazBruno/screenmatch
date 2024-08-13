package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Title;

import java.util.ArrayList;

public class MainWithLists {
    public static void main(String[] args) {
        Movie favorite = new Movie("The Matris", 1999);
        favorite.evaluates(10);

        Movie another = new Movie("John Wick", 2014);
        another.evaluates(9);

        Serie serie = new Serie("La Casa de Papel", 2017);

        ArrayList<Title> list = new ArrayList<Title>();
        list.add(favorite);
        list.add(another);
        list.add(serie);

        for (Title item: list) {
            System.out.println("Name: " +item.getMovieName());
            if (item instanceof Movie movie && movie.getClassification() > 2) {
                System.out.println("Classification: " +movie.getClassification());
            }
        }

    }
}

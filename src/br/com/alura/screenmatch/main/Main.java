package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calculations.RecomendationFilter;
import br.com.alura.screenmatch.calculations.TimeCalculator;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Episode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("The Matrix", 1999);
        myMovie.setDurationInMinutes(135);
        myMovie.setIncludedInThePlan(true);
        myMovie.evaluates(7.6);
        System.out.println(myMovie.getAverage());

        Movie anotherMovie = new Movie("John Wick", 2014);
        anotherMovie.setDurationInMinutes(101);
        anotherMovie.setIncludedInThePlan(true);
        anotherMovie.evaluates(8.7);
        System.out.println(anotherMovie.getAverage());

        Serie serie = new Serie("La Casa de Papel", 2017);
        serie.setIncludedInThePlan(true);
        serie.setActive(true);
        serie.setSeasons(5);
        serie.setEpisodesPerSeasons(10);
        serie.setMinutesPerEpisode(45);

        TimeCalculator calculator = new TimeCalculator();
        calculator.insert(myMovie);
        calculator.insert(anotherMovie);
        calculator.insert(serie);

        System.out.println("Total time: " +calculator.getTotalTime());

        Episode first = new Episode();
        first.setNumber(1);
        first.setSerie(serie);
        first.setTotalVisualizations(300);

        RecomendationFilter filter = new RecomendationFilter();
        filter.filter(myMovie);
        filter.filter(anotherMovie);
        filter.filter(first);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(myMovie);
        movieList.add(anotherMovie);

        System.out.println("List size: " + movieList.size());
        System.out.println("First movie: " + movieList.getFirst());
        System.out.println(movieList);


    }
}

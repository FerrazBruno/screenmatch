package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.exceptions.YearConversionErrorException;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {
    private String movieName;
    private int releaseYear;
    private boolean includedInThePlan;
    private double sumOfRating;
    private int overallRating;
    private int durationInMinutes;

    public Title(String movieName, int releaseYear) {
        this.movieName = movieName;
        this.releaseYear = releaseYear;
    }

    public Title(MovieOmdb myMovieOmdb) {
        this.movieName = myMovieOmdb.title();

        if (myMovieOmdb.year().length() > 4) {
            throw new YearConversionErrorException("I couldn't convert the year because it has more than 4 characters.");
        }
        this.releaseYear = Integer.valueOf(myMovieOmdb.year());
        this.durationInMinutes = Integer.valueOf(myMovieOmdb.runtime().substring(0, 2));
    }

    @Override
    public int compareTo(Title anotherTitle) {
        return this.getMovieName().compareTo(anotherTitle.getMovieName());
    }

    @Override
    public String toString() {
        return "name = " + movieName + ", releaseYear = " + releaseYear + ", duration = " + durationInMinutes;
    }

    public void displaysDataSheet() {
        System.out.println("Movie name: " +movieName);
        System.out.println("Release year: " +releaseYear);
        System.out.println("Movie duration: " +durationInMinutes);
        System.out.println("Have a plan: " +includedInThePlan);
    }

    public void evaluates(double grade) {
        sumOfRating += grade;
        overallRating++;
    }

    public double getAverage() {
        return sumOfRating / overallRating;
    }

    public String getMovieName() {
        return this.movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
}

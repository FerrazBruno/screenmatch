package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculations.Classifiable;

public class Movie extends Title implements Classifiable {

    private String director;

    public Movie(String movieName, int releaseYear) {
        super(movieName, releaseYear);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) getAverage() / 2;
    }

    @Override
    public String toString() {
        return "Movie: " + this.getMovieName() + " (" + this.getReleaseYear() + ")";
    }
}

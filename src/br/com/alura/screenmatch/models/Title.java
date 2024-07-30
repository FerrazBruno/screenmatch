package br.com.alura.screenmatch.models;

public class Title {
    private String movieName;
    private int releaseYear;
    private boolean includedInThePlan;
    private double sumOfRating;
    private int overallRating;
    private int durationInMinutes;

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

    public void setMovieName(String movieName) {
        this.movieName = movieName;
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

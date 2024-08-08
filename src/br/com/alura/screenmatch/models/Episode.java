package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculations.Classifiable;

public class Episode implements Classifiable {
    private int totalVisualizations;
    private String name;
    private Serie serie;
    private int number;

    public int getTotalVisualizations() {
        return totalVisualizations;
    }

    public void setTotalVisualizations(int totalVisualizations) {
        this.totalVisualizations = totalVisualizations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getClassification() {
        if (totalVisualizations >= 100) {
            return 4;
        }
        return 2;
    }
}

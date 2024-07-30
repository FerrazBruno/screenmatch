package br.com.alura.screenmatch.calculations;

import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {

    private int totalTime;

    public void insert(Title title) {
        totalTime += title.getDurationInMinutes();
    }

    public int getTotalTime() {
        return totalTime;
    }
}

package br.com.alura.screenmatch.calculations;

public class RecomendationFilter {

    public void filter(Classifiable classifiable) {
        System.out.println("Classification: " +classifiable.getClassification());
        if (classifiable.getClassification() >= 4) {
            System.out.println("This is among the favorites of the moment.");
        } else if (classifiable.getClassification() >= 2) {
            System.out.println("Very well rated at the moment.");
        } else {
            System.out.println("Put in your list to watch later.");
        }
    }
}

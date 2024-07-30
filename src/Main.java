import br.com.alura.screenmatch.calculations.TimeCalculator;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setMovieName("The Matrix");
        myMovie.setReleaseYear(1999);
        myMovie.setDurationInMinutes(135);
        myMovie.setIncludedInThePlan(true);

        Movie anotherMovie = new Movie();
        anotherMovie.setMovieName("John Wick");
        anotherMovie.setReleaseYear(2014);
        anotherMovie.setDurationInMinutes(101);
        anotherMovie.setIncludedInThePlan(true);

        Serie serie = new Serie();
        serie.setMovieName("La Casa de Papel");
        serie.setReleaseYear(2017);
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
    }
}

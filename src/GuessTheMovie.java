import java.io.FileNotFoundException;

public class GuessTheMovie {

    public GuessTheMovie() throws FileNotFoundException {
    }

    public static void main(String[] args) throws FileNotFoundException {
        Movie movie = new Movie();
        String randomMovie = movie.getRandomMovie();

        int points = 10;

        System.out.println(randomMovie);

    }
}

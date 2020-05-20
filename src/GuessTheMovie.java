import java.io.FileNotFoundException;
import java.util.Scanner;

public class GuessTheMovie {

    // I need a helper function that takes randomMovie and an array of characters as arguments.
    // Function will return a String of correct letters and underscores.

    public static void main(String[] args) throws FileNotFoundException {
        Movie movie = new Movie();
        String randomMovie = movie.getRandomMovie();

        Scanner scanner = new Scanner(System.in);

        int points = 10;
        boolean hasWon = false;

        System.out.println("I'm thinking of a movie. Can you guess the title?\n");
        while (points > 0 && !hasWon) {
            //placeholder switch of conditional statements
            hasWon = true;
            points--;
        }
    }
}

import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Movie {
    private final File file = new File("movies.txt");
    private final Scanner scanner = new Scanner(file);
    private final List<String> movies = new ArrayList<>();
    private String randomMovie;

    private void setRandomMovie(){
        // read the file and create a list of movies
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            movies.add(line);
        }

        // select random movie from movies
        int randomMovieIndex = (int)(Math.random() * movies.size());
        randomMovie = movies.get(randomMovieIndex);
    }

    public Movie() throws FileNotFoundException {
        this.setRandomMovie();
    }

    public String getRandomMovie() {
        return this.randomMovie;
    }
}


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuessTheMovie {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);

        List<String> movies = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            movies.add(line);
        }


    }
}


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter filename:");

        List<Book> fileBookList = readBooks(scanner.nextLine());

        fileBookList.stream()
                .forEach(book -> System.out.println(book));

    }

    public static List<Book> readBooks(String file) {
        List<Book> returnList = new ArrayList<>();

        try {
            returnList = Files.lines(Paths.get(file))
                    .map(line -> line.split(","))
                    .filter(lineParts -> lineParts.length >= 4)
                    .map(lineParts -> new Book(lineParts[0], Integer.valueOf(lineParts[1]), Integer.valueOf(lineParts[2]), lineParts[3]))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return returnList;
    }
}

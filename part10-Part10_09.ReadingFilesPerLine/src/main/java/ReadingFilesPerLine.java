
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter filename:");

        List<String> fileLineList = read(scanner.nextLine());

        fileLineList.stream()
                .forEach(line -> System.out.println(line));
    }

    public static List<String> read(String file) {
        List<String> returnList = new ArrayList<>();

        try {
            Files.lines(Paths.get(file)).forEach(row -> returnList.add(row));
            
            /* alternate
            Files.lines(Paths.get(file)).collect(Collectors.toList());
            */
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return returnList;
    }
}

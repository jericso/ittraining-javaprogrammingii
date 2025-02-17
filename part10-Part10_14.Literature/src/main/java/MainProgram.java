
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        System.out.println("Input the name of the book, empty stops: ");
        String name = scanner.nextLine();
        int ageRecommendation;
        while (!name.equals("")) {
            System.out.println("Input the age recommendation: ");
            ageRecommendation = Integer.valueOf(scanner.nextLine());

            books.add(new Book(name, ageRecommendation));

            System.out.println("\nInput the name of the book, empty stops: ");
            name = scanner.nextLine();
        }

        System.out.println(books.size() + " books in total.");

        Comparator<Book> byAgeRecommendationName = Comparator
                .comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getName);
        Collections.sort(books, byAgeRecommendationName);

        System.out.println("\nBooks:");
        books.stream().forEach(book -> System.out.println(book));
    }
}

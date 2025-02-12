
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");

        String row = scanner.nextLine();
        while (!row.equals("end")) {
            inputs.add(Integer.valueOf(row));
            row = scanner.nextLine();
        }

        System.out.println("\nPrint the average of the negative numbers or the positive numbers? (n/p)");

        String sign = scanner.nextLine();
        if (sign.equals("n")) {
            System.out.println("Average of the negative numbers: " + inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble());
        } else if (sign.equals("p")) {
            System.out.println("Average of the positive numbers: " + inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble());
        }
    }
}

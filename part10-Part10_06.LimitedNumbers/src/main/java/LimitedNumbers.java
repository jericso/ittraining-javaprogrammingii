
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();

        Integer row = Integer.valueOf(scanner.nextLine());
        while (row > 0) {

            inputs.add(row);
            row = Integer.valueOf(scanner.nextLine());
        }

        inputs.stream()
                .filter(input -> (input >= 1) && (input <= 5))
                .forEach(input -> System.out.println(input));

    }
}

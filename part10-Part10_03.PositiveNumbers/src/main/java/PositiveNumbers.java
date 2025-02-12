
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");

        String row = scanner.nextLine();
        while (!row.equals("end")) {
            inputs.add(Integer.valueOf(row));
            row = scanner.nextLine();
        }

        System.out.println(positive(inputs));
    }

    public static List<Integer> positive(List<Integer> numbers) {
//        return numbers.stream()
//                .filter(number -> number > 0)
//                .collect(Collectors.toCollection(ArrayList::new));

        return numbers.stream()
                .filter(number -> number > 0)
                .collect(Collectors.toList());
    }
}

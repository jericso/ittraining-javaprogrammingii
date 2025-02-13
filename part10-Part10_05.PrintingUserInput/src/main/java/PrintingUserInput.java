
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        
        String row = scanner.nextLine();
        while (!row.equals("")) {
            inputs.add(row);
            row = scanner.nextLine();
        }
        
        inputs.stream().forEach(input -> System.out.println(input));
    }
}

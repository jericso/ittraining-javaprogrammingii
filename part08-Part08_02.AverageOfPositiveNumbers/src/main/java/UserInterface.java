
import java.util.Scanner;

public class UserInterface {

    private PositiveNumberRegister positiveNumberRegister;
    private Scanner scanner;

    public UserInterface(PositiveNumberRegister positives, Scanner scanner) {
        this.positiveNumberRegister = new PositiveNumberRegister();
        this.scanner = scanner;
    }

    public void start() {
        String input = "";
        int inputInteger = 0;

        input = this.scanner.nextLine();
        while (!input.equals("0")) {
            inputInteger = Integer.parseInt(input);
            this.positiveNumberRegister.addNumber(inputInteger);

            input = this.scanner.nextLine();
        }

        double average = this.positiveNumberRegister.getAverage();
        if (average == 0.0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(average);
        }
    }
}


import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        PositiveNumberRegister positives = new PositiveNumberRegister();
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(positives, scanner);

        ui.start();
    }
}

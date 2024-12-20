
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        String input = "";
        int inputInteger = 0;

        input = this.scanner.nextLine();
        while (!input.equals("end")) {
            inputInteger = Integer.parseInt(input);
            System.out.println((int) Math.pow(inputInteger, 3));

            input = this.scanner.nextLine();
        }
    }
}

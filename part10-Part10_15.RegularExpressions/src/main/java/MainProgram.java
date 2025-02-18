
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Checker checker = new Checker();

        System.out.println("Enter a string:");
        String string = scanner.nextLine();
        System.out.println("The form is " + (checker.timeOfDay(string) ? "correct" : "incorrect") + ".");
    }
}

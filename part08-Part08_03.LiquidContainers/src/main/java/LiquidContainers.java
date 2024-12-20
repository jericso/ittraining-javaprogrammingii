
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                String[] parts = input.split(" ");
                String command = parts[0];
                int quantity = Integer.parseInt(parts[1]);

                if (command.equals("add")) {
                    if (quantity > 0) {
                        firstContainer += quantity;

                        if (firstContainer > 100) {
                            firstContainer = 100;
                        }
                    }
                } else if (command.equals("move")) {
                    if (quantity > 0) {
                        if (quantity >= firstContainer) {
                            secondContainer += firstContainer;
                            firstContainer = 0;
                        } else {
                            secondContainer += quantity;
                            firstContainer -= quantity;
                        }

                        if (secondContainer > 100) {
                            secondContainer = 100;
                        }
                    }
                } else if (command.equals("remove")) {
                    if (quantity > 0) {
                        secondContainer -= quantity;

                        if (secondContainer < 0) {
                            secondContainer = 0;
                        }
                    }
                }
            }
        }
    }
}

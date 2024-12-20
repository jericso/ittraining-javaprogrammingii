
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                String[] parts = input.split(" ");
                String command = parts[0];
                int quantity = Integer.parseInt(parts[1]);

                if (command.equals("add")) {
                    firstContainer.add(quantity);
                } else if (command.equals("move")) {
                    if (quantity >= firstContainer.contains()) {
                        secondContainer.add(firstContainer.contains());
                        firstContainer.remove(firstContainer.contains());
                    } else {
                        secondContainer.add(quantity);
                        firstContainer.remove(quantity);
                    }
                } else if (command.equals("remove")) {
                    secondContainer.remove(quantity);
                }
            }
        }
    }
}

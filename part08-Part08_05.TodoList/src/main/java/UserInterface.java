
import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    private void addTask() {
        System.out.println("To add:");
        this.todoList.add(this.scanner.nextLine());
    }

    private void removeTask() {
        System.out.println("Which one is removed?");
        this.todoList.remove(Integer.parseInt(this.scanner.nextLine()));
    }

    public void start() {
        String command = "";

        System.out.println("Command:");
        command = this.scanner.nextLine();
        while (!command.equals("stop")) {
            switch (command) {
                case "add":
                    this.addTask();
                    break;
                case "list":
                    this.todoList.print();
                    break;
                case "remove":
                    this.removeTask();
                    break;
            }

            System.out.println("Command:");
            command = this.scanner.nextLine();
        }
    }
}

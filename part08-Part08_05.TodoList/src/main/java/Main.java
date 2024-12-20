
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(todoList, scanner);
        
        ui.start();
    }
}

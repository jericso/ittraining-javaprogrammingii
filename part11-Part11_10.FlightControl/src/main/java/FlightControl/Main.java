package FlightControl;

import java.util.Scanner;
import flightcontrol.logic.FlightControl;
import flightcontrol.ui.TextUI;

public class Main {

    public static void main(String[] args) {
        FlightControl flightControl = new FlightControl();
        Scanner scanner = new Scanner(System.in);

        TextUI textUI = new TextUI(flightControl, scanner);

        textUI.start();
    }
}

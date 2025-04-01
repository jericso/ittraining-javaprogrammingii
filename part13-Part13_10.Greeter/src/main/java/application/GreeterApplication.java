package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    @Override
    public void start(Stage window) {
        Label instructionText = new Label("Enter your name and start.");
        TextField nameField = new TextField();
        Button startButton = new Button("Start");

        GridPane inputLayout = new GridPane();
        inputLayout.add(instructionText, 0, 0);
        inputLayout.add(nameField, 0, 1);
        inputLayout.add(startButton, 0, 2);

        inputLayout.setPrefSize(300, 180);
        inputLayout.setAlignment(Pos.CENTER);
        inputLayout.setVgap(10);
        inputLayout.setHgap(10);
        inputLayout.setPadding(new Insets(20, 20, 20, 20));

        Scene inputView = new Scene(inputLayout);

        Label greeting = new Label();

        StackPane greetingLayout = new StackPane();
        greetingLayout.setPrefSize(300, 180);
        greetingLayout.getChildren().add(greeting);
        greetingLayout.setAlignment(Pos.CENTER);

        Scene greetingView = new Scene(greetingLayout);

        startButton.setOnAction((event) -> {
            greeting.setText("Welcome " + nameField.getText() + "!");
            window.setScene(greetingView);
        });

        window.setScene(inputView);
        window.show();
    }

    public static void main(String[] args) {
        Application.launch(GreeterApplication.class);
    }
}

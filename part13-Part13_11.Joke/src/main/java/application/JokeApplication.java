package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {
    
    private StackPane createLayout(String text) {
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        
        return layout;
    }
    
    @Override
    public void start(Stage window) {
        BorderPane mainLayout = new BorderPane();
        
        HBox menuLayout = new HBox();
        menuLayout.setPadding(new Insets(20, 20, 20, 20));
        menuLayout.setSpacing(10);
        
        Button jokeButton = new Button("Joke");
        Button answerButton = new Button("Answer");
        Button explanationButton = new Button("Explanation");
        
        menuLayout.getChildren().addAll(jokeButton, answerButton, explanationButton);
        
        mainLayout.setTop(menuLayout);
        
        StackPane jokeLayout = this.createLayout("What do you call a bear with no teeth?");
        StackPane answerLayout = this.createLayout("A gummy bear.");
        StackPane explanationLayout = this.createLayout("This is humorous because of\nthe existence of the candy \"Gummy Bears\"\nand that a toothless bear would\nbe all gums.");
        
        jokeButton.setOnAction((event) -> mainLayout.setCenter(jokeLayout));
        answerButton.setOnAction((event) -> mainLayout.setCenter(answerLayout));
        explanationButton.setOnAction((event) -> mainLayout.setCenter(explanationLayout));
        
        mainLayout.setCenter(jokeLayout);
        
        Scene view = new Scene(mainLayout);
        
        window.setScene(view);
        window.show();
    }
    
    public static void main(String[] args) {
        Application.launch(JokeApplication.class);
    }
}

package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MultipleViews extends Application {
    
    @Override
    public void start(Stage window) {
        Label firstViewLabel = new Label("First view!");
        Label secondViewLabel = new Label("Second view!");
        Label thirdViewLabel = new Label("Third view!");
        Button firstViewButon = new Button("To the second view!");
        Button secondViewButon = new Button("To the third view!");
        Button thirdViewButon = new Button("To the first view!");
        
        BorderPane firstViewLayout = new BorderPane();
        firstViewLayout.setTop(firstViewLabel);
        firstViewLayout.setCenter(firstViewButon);
        
        VBox secondViewLayout = new VBox();
        secondViewLayout.getChildren().addAll(secondViewButon, secondViewLabel);
        
        GridPane thirdViewLayout = new GridPane();
        thirdViewLayout.add(thirdViewLabel, 0, 0);
        thirdViewLayout.add(thirdViewButon, 1, 1);
        
        Scene firstScene = new Scene(firstViewLayout);
        Scene secondScene = new Scene(secondViewLayout);
        Scene thirdScene = new Scene(thirdViewLayout);
        
        firstViewButon.setOnAction((event) -> {
            window.setScene(secondScene);
        });
        
        secondViewButon.setOnAction((event) -> {
            window.setScene(thirdScene);
        });
        
        thirdViewButon.setOnAction((event) -> {
            window.setScene(firstScene);
        });
        
        window.setScene(firstScene);
        window.show();
    }
    
    public static void main(String[] args) {
        Application.launch(MultipleViews.class);
    }
}

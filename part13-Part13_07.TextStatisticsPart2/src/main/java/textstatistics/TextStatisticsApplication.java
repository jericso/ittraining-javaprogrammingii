package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {
    
    @Override
    public void start(Stage window) {
        Label letterCount = new Label("Letters: 0");
        Label wordCount = new Label("Words: 0");
        Label longestWord = new Label("The longest word is:");
        TextArea textArea = new TextArea();
        
        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            String[] words = newValue.split(" ");
            String longest = Arrays.stream(words)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            
            letterCount.setText("Letters: " + newValue.length());
            wordCount.setText("Words: " + words.length);
            longestWord.setText("The longest word is: " + longest);
        });
        
        HBox statistics = new HBox();
        statistics.setSpacing(10);
        statistics.getChildren().add(letterCount);
        statistics.getChildren().add(wordCount);
        statistics.getChildren().add(longestWord);
        
        BorderPane layout = new BorderPane();
        layout.setCenter(textArea);
        layout.setBottom(statistics);
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }
    
    public static void main(String[] args) {
        Application.launch(TextStatisticsApplication.class);
    }
}

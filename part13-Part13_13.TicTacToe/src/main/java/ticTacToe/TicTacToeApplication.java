package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    private Game game;

    public TicTacToeApplication() {
        super();
        this.game = new Game();
    }

    private Button createButton(Label gameStatus, int column, int row) {
        Button button = new Button(" ");
        button.setFont(Font.font("Monospaced", 40));

        button.setOnAction((event) -> {
            if (button.getText().isBlank() && !this.game.getGameStatus().equals("The end!")) {
                button.setText(this.game.getCurrentPlayer());
                this.game.setSquare(row, column);
                gameStatus.setText(this.game.getGameStatus());
            }
        });

        return button;
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane mainLayout = new BorderPane();

        Label gameStatus = new Label(this.game.getGameStatus());
        gameStatus.setFont(Font.font("Monospaced", 40));

        GridPane gameLayout = new GridPane();
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                gameLayout.add(createButton(gameStatus, column, row), column, row);
            }
        }

        gameLayout.setVgap(10);
        gameLayout.setHgap(10);
        gameLayout.setPadding(new Insets(10, 10, 10, 10));

        mainLayout.setTop(gameStatus);
        mainLayout.setCenter(gameLayout);

        Scene view = new Scene(mainLayout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        Application.launch(TicTacToeApplication.class);
    }
}

package ticTacToe;

public class Game {

    private int moveCount;
    private String currentPlayer;
    private String[][] gameBoard;

    public Game() {
        this.moveCount = 0;
        this.currentPlayer = "X";
        this.gameBoard = new String[3][3];
    }

    private boolean horizontalMatch() {
        for (int row = 0; row < 3; row++) {
            String first = this.gameBoard[row][0];
            if (first == null) {
                continue;
            }

            boolean stillEqual = true;
            for (int column = 1; column < 3; column++) {
                if (gameBoard[row][column] == null || !gameBoard[row][column].equals(first)) {
                    stillEqual = false;
                    break;
                }
            }
            if (stillEqual) {
                return true;
            }
        }

        return false;
    }

    private boolean verticalMatch() {
        for (int column = 0; column < 3; column++) {
            String first = this.gameBoard[0][column];
            if (first == null) {
                continue;
            }

            boolean stillEqual = true;
            for (int row = 1; row < 3; row++) {
                if (gameBoard[row][column] == null || !gameBoard[row][column].equals(first)) {
                    stillEqual = false;
                    break;
                }
            }
            if (stillEqual) {
                return true;
            }
        }

        return false;
    }

    private boolean diagonalMatch() {
        String first = this.gameBoard[0][0];
        if (first != null) {
            boolean stillEqual = true;
            for (int i = 1; i < 3; i++) {
                if (gameBoard[i][i] == null || !gameBoard[i][i].equals(first)) {
                    stillEqual = false;
                    break;
                }
            }

            if (stillEqual) {
                return true;
            }
        }

        first = this.gameBoard[0][2];
        if (first != null) {
            boolean stillEqual = true;
            for (int i = 1; i < 3; i++) {
                if (gameBoard[i][2 - i] == null || !gameBoard[i][2 - i].equals(first)) {
                    stillEqual = false;
                    break;
                }
            }

            if (stillEqual) {
                return true;
            }
        }

        return false;
    }

    private boolean isOver() {
        if (this.moveCount == 9) {
            return true;
        }

        return this.horizontalMatch() || this.verticalMatch() || this.diagonalMatch();
    }

    public String getCurrentPlayer() {
        return this.currentPlayer;
    }

    public String getGameStatus() {
        return this.isOver() ? "The end!" : "Turn: " + this.currentPlayer;
    }

    public void setSquare(int row, int column) {
        this.moveCount++;
        this.gameBoard[row][column] = this.currentPlayer;
        this.currentPlayer = (this.currentPlayer == "X") ? "O" : "X";
    }
}

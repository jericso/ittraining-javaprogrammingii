
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> rowSums = new ArrayList<>();

        for (int row = 0; row < this.square.length; row++) {
            int rowSum = 0;
            for (int column = 0; column < this.square[row].length; column++) {
                rowSum += this.square[row][column];
            }
            rowSums.add(rowSum);
        }

        return rowSums;
    }

    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> columnSums = new ArrayList<>();

        for (int column = 0; column < this.square[0].length; column++) {
            int columnSum = 0;
            for (int row = 0; row < this.square.length; row++) {
                columnSum += this.square[row][column];
            }
            columnSums.add(columnSum);
        }

        return columnSums;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> diagonalSums = new ArrayList<>();

        int diagonalSum = 0;
        int diagonalColumn = 0;
        for (int row = 0; row < this.square.length; row++) {
            for (int column = 0; column < this.square[row].length; column++) {
                if (column == diagonalColumn) {
                    diagonalSum += this.square[row][column];
                    diagonalColumn++;
                    break;
                }
            }
        }
        diagonalSums.add(diagonalSum);

        diagonalSum = 0;
        diagonalColumn = this.square[0].length - 1;
        for (int row = 0; row < this.square.length; row++) {
            for (int column = this.square[0].length - 1; column >= 0; column--) {
                if (column == diagonalColumn) {
                    diagonalSum += this.square[row][column];
                    diagonalColumn--;
                    break;
                }
            }
        }
        diagonalSums.add(diagonalSum);

        return diagonalSums;

        /* alternate
        ArrayList<Integer> sumsOfDiagonals = new ArrayList<>();
 
        int sum = 0;
        for (int y = 0; y < square.length; y++) {
            sum += square[y][y];
        }
        sumsOfDiagonals.add(sum);
 
        sum = 0;
        for (int y = 0; y < square.length; y++) {
            sum += square[square.length - y - 1][y];
        }
        sumsOfDiagonals.add(sum);
 
        return sumsOfDiagonals; */
    }

    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (!sums.get(i - 1).equals(sums.get(i))) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}


public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // assume size is odd
        int xIndex = size / 2;
        int yIndex = 0;
        int currentValue = 1;
        square.placeValue(xIndex, yIndex, currentValue);
        xIndex++;
        yIndex++;
        currentValue++;
        /* alternate
        int totalValues = size * size;
        while (currentValue <= totalValues) { */
        while (!square.isMagicSquare()) {
            if (xIndex >= square.getWidth()) {
                xIndex = 0;
            }
            if (yIndex > 0) {
                yIndex = (square.getHeight() - 1) * -1;
            }

            if (square.readValue(xIndex, Math.abs(yIndex)) != 0) {
                if (xIndex == 0) {
                    xIndex = square.getWidth() - 1;
                } else {
                    xIndex -= 1;
                }

                if (yIndex == (square.getHeight() - 1) * -1) {
                    yIndex = -1;
                } else {
                    yIndex -= 2;
                }
            } else {
                square.placeValue(xIndex, Math.abs(yIndex), currentValue);
                xIndex++;
                yIndex++;
                currentValue++;
            }
        }

        return square;
    }
}

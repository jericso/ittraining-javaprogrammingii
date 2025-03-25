
public class Program {

    public static void main(String[] args) {

        MagicSquareFactory msFactory = new MagicSquareFactory();
        MagicSquare magicSquare = msFactory.createMagicSquare(15);
        System.out.println(magicSquare);
        System.out.println(magicSquare.sumsOfRows());
        System.out.println(magicSquare.sumsOfColumns());
        System.out.println(magicSquare.sumsOfDiagonals());
    }
}

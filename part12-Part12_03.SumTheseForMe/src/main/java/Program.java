
public class Program {

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        int returnSum = 0;

        if (fromWhere < 0) {
            fromWhere = 0;
        }

        if (toWhere > (array.length - 1)) {
            toWhere = array.length - 1;
        }

        for (int i = fromWhere; i <= toWhere; i++) {
            int arrayValue = array[i];
            if (arrayValue >= smallest && arrayValue <= largest) {
                returnSum += arrayValue;
            }
        }

        return returnSum;
    }

    public static void main(String[] args) {
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));
    }
}

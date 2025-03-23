
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        Random random = new Random();

        this.numbers = new ArrayList<>();

        while (this.numbers.size() < 7) {
            int randomNumber = random.nextInt(40) + 1;
            if (!containsNumber(randomNumber)) {
                this.numbers.add(randomNumber);
            }
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}

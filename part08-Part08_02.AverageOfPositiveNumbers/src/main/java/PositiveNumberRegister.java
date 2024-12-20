
import java.util.ArrayList;

public class PositiveNumberRegister {

    private ArrayList<Integer> numbers;

    public PositiveNumberRegister() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        if (number > 0) {
            this.numbers.add(number);
        }
    }

    public double getAverage() {
        if (this.numbers.size() == 0) {
            return 0.0;
        }

        int total = 0;
        for (Integer number : this.numbers) {
            total += number;
        }

        return (total * 1.0) / this.numbers.size();
    }
}

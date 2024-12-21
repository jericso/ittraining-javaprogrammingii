
import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> IOUs;

    public IOU() {
        this.IOUs = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.IOUs.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.IOUs.getOrDefault(toWhom, 0.0);
    }
}

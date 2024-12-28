
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> changeHistory;

    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }

    @Override
    public String toString() {
        return this.changeHistory.toString();
    }

    public double maxValue() {
        if (this.changeHistory.isEmpty()) {
            return 0.0;
        }

        double maximumStatus = 0.0;
        for (double status : this.changeHistory) {
            if (status > maximumStatus) {
                maximumStatus = status;
            }
        }

        return maximumStatus;
    }

    public double minValue() {
        if (this.changeHistory.isEmpty()) {
            return 0.0;
        }

        double minimumStatus = Double.MAX_VALUE;
        for (double status : this.changeHistory) {
            if (status < minimumStatus) {
                minimumStatus = status;
            }
        }

        return minimumStatus;
    }

    public double average() {
        if (this.changeHistory.isEmpty()) {
            return 0.0;
        }

        double totalStatuses = 0.0;
        for (double status : this.changeHistory) {
            totalStatuses += status;
        }

        return totalStatuses / this.changeHistory.size();
    }

    public void add(double status) {
        this.changeHistory.add(status);
    }

    public void clear() {
        this.changeHistory.clear();
    }
}

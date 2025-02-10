
import java.util.ArrayList;

public class Box implements Packable {

    private ArrayList<Packable> items;
    private double maximumCapacity;

    public Box(double maximumCapacity) {
        this.items = new ArrayList<>();
        this.maximumCapacity = maximumCapacity;
    }

    @Override
    public double weight() {
        double boxWeight = 0.0;
        for (Packable item : this.items) {
            boxWeight += item.weight();
        }

        return boxWeight;
    }

    private boolean overCapacity(Packable itemToAdd) {
        if ((this.weight() + itemToAdd.weight()) > this.maximumCapacity) {
            return true;
        }

        return false;
    }

    public void add(Packable item) {
        if (!overCapacity(item)) {
            this.items.add(item);
        }
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
}

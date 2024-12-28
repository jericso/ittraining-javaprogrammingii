
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private ArrayList<Item> items;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    private int getTotalItemWeight() {
        if (this.items.isEmpty()) {
            return 0;
        }

        int itemWeight = 0;
        for (Item item : this.items) {
            itemWeight += item.getWeight();
        }

        return itemWeight;
    }

    @Override
    public void add(Item item) {
        if ((this.getTotalItemWeight() + item.getWeight()) <= this.capacity) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }

}

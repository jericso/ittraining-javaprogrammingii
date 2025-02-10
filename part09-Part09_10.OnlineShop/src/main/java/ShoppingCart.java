
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        Item addItem = this.items.get(product);
        if (addItem != null) {
            addItem.increaseQuantity();
        } else {
            this.items.put(product, new Item(product, 1, price));
        }
        
        /* alternate
        this.items.putIfAbsent(product, new Item(product, 0, price));
        this.items.get(product).increaseQuantity();
        */
    }

    public int price() {
        int returnPrice = 0;

        for (Item item : this.items.values()) {
            returnPrice += item.price();
        }

        return returnPrice;
    }

    public void print() {
        for (Item item : this.items.values()) {
            System.out.println(item);
        }
    }
}

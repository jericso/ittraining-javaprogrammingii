
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> productPrices;
    private Map<String, Integer> productStock;

    public Warehouse() {
        this.productPrices = new HashMap<>();
        this.productStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productPrices.put(product, price);
        this.productStock.put(product, stock);
    }

    public int price(String product) {
        Integer returnPrice = this.productPrices.get(product);

        if (returnPrice != null) {
            return returnPrice;
        } else {
            return -99;
        }
        
        /* alternate
        return this.productPrices.getOrDefault(product, -99);
        */
    }

    public int stock(String product) {
        Integer returnStock = this.productStock.get(product);

        if (returnStock != null) {
            return returnStock;
        } else {
            return 0;
        }
        
        /* alternate
        return this.productStock.getOrDefault(product, 0);
        */
    }

    public boolean take(String product) {
       int productStock = this.stock(product);
        
       if (productStock != 0) {
            this.productStock.put(product, --productStock);
            return true;
        } else {
            return false;
        }
       
       /* alternate
        if (!this.quantities.containsKey(product)) {
            return false;
        }
        
        int stock = this.quantities.get(product);
        if (stock <= 0) {
            return false;
        }
 
        this.quantities.put(product, stock - 1);
        return true;
       */
    }

    public Set<String> products() {
        return this.productPrices.keySet();
    }
}

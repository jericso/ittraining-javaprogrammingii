
public class ProductWarehouse extends Warehouse {

    private String product;

    public ProductWarehouse(String product, double capacity) {
        super(capacity);
        this.product = product;
    }

    public String getName() {
        return this.product;
    }
    
    @Override
    public String toString() {
        return this.product + ": " + super.toString();
    }
    
    public void setName(String newName) {
        this.product = newName;
    }
}

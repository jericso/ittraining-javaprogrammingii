
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String product, double capacity, double initialBalance) {
        super(product, capacity);
        this.changeHistory = new ChangeHistory();

        this.addToWarehouse(initialBalance);
    }

    public String history() {
        return this.changeHistory.toString();
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + this.changeHistory.minValue());
        System.out.println("Average: " + this.changeHistory.average());
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changeHistory.add(this.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double received = super.takeFromWarehouse(amount);
        this.changeHistory.add(this.getBalance());

        return received;
    }
}

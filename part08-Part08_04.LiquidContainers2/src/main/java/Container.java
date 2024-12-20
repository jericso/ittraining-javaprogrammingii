
public class Container {

    private int contents;

    public Container() {
        this.contents = 0;
    }

    public int contains() {
        return this.contents;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.contents += amount;
            if (this.contents > 100) {
                this.contents = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.contents -= amount;
            if (this.contents < 0) {
                this.contents = 0;
            }
        }
    }

    @Override
    public String toString() {
        return this.contents + "/100";
    }
}

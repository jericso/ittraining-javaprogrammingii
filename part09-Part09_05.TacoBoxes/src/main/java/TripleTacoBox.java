
public class TripleTacoBox implements TacoBox {

    private int tacos;

    public TripleTacoBox() {
        this.tacos = 3;
    }

    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
        if ((this.tacos - 1) >= 0) {
            this.tacos--;
        }
    }

    @Override
    public String toString() {
        return "This triple taco box contains: " + this.tacos + " tacos.";
    }
}

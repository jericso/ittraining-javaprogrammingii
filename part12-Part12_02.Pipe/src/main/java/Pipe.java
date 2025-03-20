
import java.util.ArrayList;

public class Pipe<T> {

    private ArrayList<T> items;

    public Pipe() {
        this.items = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.items.add(value);
    }

    public T takeFromPipe() {
        T returnItem;

        if (this.items.size() > 0) {
            returnItem = this.items.get(0);
            this.items.remove(0);
            return returnItem;
        }

        return null;
    }

    public boolean isInPipe() {
        return this.items.size() > 0;
    }
}

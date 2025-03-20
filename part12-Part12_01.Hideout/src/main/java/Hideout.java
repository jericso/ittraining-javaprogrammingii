
public class Hideout<T> {

    private T hidden;

    public Hideout() {
    }

    public void putIntoHideout(T toHide) {
        this.hidden = toHide;
    }

    public T takeFromHideout() {
        T returnItem = this.hidden;

        this.hidden = null;

        return returnItem;
    }

    public boolean isInHideout() {
        return this.hidden != null;
    }
}

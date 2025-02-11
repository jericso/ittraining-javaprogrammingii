
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> organisms;

    public Herd() {
        this.organisms = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.organisms.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable organism : this.organisms) {
            organism.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String returnString = "";

        for (Movable organism : this.organisms) {
            returnString += organism + "\n";
        }

        return returnString.trim();
    }
}

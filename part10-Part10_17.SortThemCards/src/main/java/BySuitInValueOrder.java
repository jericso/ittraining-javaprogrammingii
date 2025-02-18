
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card t, Card t1) {
        if (t.getSuit().ordinal() == t1.getSuit().ordinal()) {
            return t.getValue() - t1.getValue();
        }

        return t.getSuit().ordinal() - t1.getSuit().ordinal();

        /* alternate
        if (t.getSuit() == t1.getSuit()) {
            return t.getValue() - t1.getValue();
        }
 
        return t.getSuit().compareTo(t1.getSuit());     
         */
    }
}

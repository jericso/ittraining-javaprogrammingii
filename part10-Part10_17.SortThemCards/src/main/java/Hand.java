
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Hand implements Comparable<Hand> {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void sort() {
        Collections.sort(this.cards);
    }

    public void print() {
        this.cards.stream().forEach(card -> System.out.println(card));
    }

    public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand other) {
        return (this.cards.stream()
                .map(card -> card.getValue())
                .reduce(0, (previousSum, value) -> previousSum + value))
                - (other.cards.stream()
                        .map(card -> card.getValue())
                        .reduce(0, (previousSum, value) -> previousSum + value));
    }
}

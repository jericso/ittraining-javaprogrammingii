
public class Book {
/* alternate
public class Book implements Comparable<Book> {
*/
    private String name;
    private int ageRecommendation;

    public Book(String name, int ageRecommendation) {
        this.name = name;
        this.ageRecommendation = ageRecommendation;
    }

    public String getName() {
        return this.name;
    }

    public int getAgeRecommendation() {
        return this.ageRecommendation;
    }

    @Override
    public String toString() {
        return this.getName() + " (recommended for " + this.getAgeRecommendation() + " year-olds or older)";
    }

    /* alternate
    @Override
    public int compareTo(Book other) {
        if (this.ageRecommendation == other.ageRecommendation) {
            return this.name.compareTo(other.name);
        }

        return this.ageRecommendation - other.ageRecommendation;
    }
    */
}


public class LiteracyDemographic implements Comparable<LiteracyDemographic> {

    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private int year;
    private double literacyPercent;

    public LiteracyDemographic(String theme, String ageGroup, String gender, String country, int year, double literacyPercent) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    public double getLiteracyPercent() {
        return this.literacyPercent;
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + literacyPercent;
    }

    @Override
    public int compareTo(LiteracyDemographic other) {
        if (this.getLiteracyPercent() == other.getLiteracyPercent()) {
            return 0;
        } else if ((this.getLiteracyPercent() - other.getLiteracyPercent()) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}

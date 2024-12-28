
public class Student extends Person {

    private int studyCredits;

    public Student(String fullName, String fullAddress) {
        super(fullName, fullAddress);
        this.studyCredits = 0;
    }

    public int credits() {
        return this.studyCredits;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + this.studyCredits;
    }

    public void study() {
        this.studyCredits++;
    }
}

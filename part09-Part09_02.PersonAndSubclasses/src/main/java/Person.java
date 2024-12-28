
public class Person {

    private String fullName;
    private String fullAddress;

    public Person(String fullName, String fullAddress) {
        this.fullName = fullName;
        this.fullAddress = fullAddress;
    }

    @Override
    public String toString() {
        return this.fullName + "\n  " + this.fullAddress;
    }
}

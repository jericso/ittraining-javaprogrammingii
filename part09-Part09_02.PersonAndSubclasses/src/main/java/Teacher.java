
public class Teacher extends Person {

    private int monthlySalary;

    public Teacher(String fullName, String fullAddress, int monthlySalary) {
        super(fullName, fullAddress);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  salary " + this.monthlySalary + " euro/month";
    }
}

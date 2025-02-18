
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Employees {

    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        this.employees.addAll(peopleToAdd);
        
        /* alternate
        peopleToAdd.stream().forEach(person -> Employees.this.add(person));
        */
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }

    public void print() {
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            Person nextEmployee = iterator.next();
            if (nextEmployee.getEducation() == education) {
                System.out.println(nextEmployee);
            }
        }
    }
}

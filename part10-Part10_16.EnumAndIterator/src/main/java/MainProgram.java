
import java.util.List;
import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
//        Person anna = new Person("Anna", Education.PHD);
//        System.out.println(anna);

//        Employees university = new Employees();
//        university.add(new Person("Petrus", Education.PHD));
//        university.add(new Person("Arto", Education.HS));
//        university.add(new Person("Elina", Education.PHD));
//
//        university.print();
//        System.out.println();
//        university.print(Education.HS);
//
//        List<Person> newEmployees = new ArrayList<>();
//        newEmployees.add(new Person("Anna", Education.PHD));
//        newEmployees.add(new Person("Jacob", Education.MA));
//        
//        university.add(newEmployees);
//        
//        System.out.println();
//        university.print();
//        System.out.println();
//        university.print(Education.PHD);

        Employees university = new Employees();
        university.add(new Person("Petrus", Education.PHD));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));

        university.print();

        university.fire(Education.HS);

        System.out.println("==");

        university.print();
    }
}

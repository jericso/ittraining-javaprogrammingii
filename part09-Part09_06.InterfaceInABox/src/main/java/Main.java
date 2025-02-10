
public class Main {

    public static void main(String[] args) {
//        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
//        Book book2 = new Book("Robert Martin", "Clean Code", 1);
//        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);
//
//        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
//        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
//        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);
//
//        System.out.println(book1);
//        System.out.println(book2);
//        System.out.println(book3);
//        System.out.println(cd1);
//        System.out.println(cd2);
//        System.out.println(cd3);

//        Box box = new Box(10);
//
//        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
//        box.add(new Book("Robert Martin", "Clean Code", 1));
//        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));
//
//        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
//        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
//        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
//
//        System.out.println(box);
        
        Box innerBox = new Box(10);

        innerBox.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        innerBox.add(new Book("Robert Martin", "Clean Code", 1));
        innerBox.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        innerBox.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        innerBox.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        innerBox.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(innerBox);

        Box smallOuterBox = new Box(3);
        Box bigOuterBox = new Box(6);

        smallOuterBox.add(innerBox);
        bigOuterBox.add(innerBox);

        System.out.println(smallOuterBox);
        System.out.println(bigOuterBox);
    }

}

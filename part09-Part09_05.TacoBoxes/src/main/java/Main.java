
public class Main {
    
    public static void main(String[] args) {
        TripleTacoBox tripleTacoBox = new TripleTacoBox();
        CustomTacoBox customTacoBox = new CustomTacoBox(4);
        
        tripleTacoBox.eat();
        customTacoBox.eat();
        
        System.out.println(tripleTacoBox);
        System.out.println(customTacoBox);
    }
}

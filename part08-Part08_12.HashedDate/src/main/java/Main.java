
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        SimpleDate hashDate = new SimpleDate(1, 2, 2000);
        String hashValue = "test";
        HashMap<SimpleDate, String> hashMap = new HashMap<>();

        hashMap.put(hashDate, hashValue);
        System.out.println(hashMap.get(hashDate));
        System.out.println(hashMap.get(new SimpleDate(1, 2, 2000)));
        System.out.println(hashMap.get(new SimpleDate(1, 3, 2000)));
    }
}


import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> nickNames = new HashMap<>();

        nickNames.put("Matthew", "Matt");
        nickNames.put("Michael", "mix");
        nickNames.put("Arthur", "Artie");

        System.out.println(nickNames.get("Matthew"));
    }
}

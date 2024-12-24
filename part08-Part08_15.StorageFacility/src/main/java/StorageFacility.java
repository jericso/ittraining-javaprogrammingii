
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageUnits;

    public StorageFacility() {
        this.storageUnits = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storageUnits.putIfAbsent(unit, new ArrayList<>());

        this.storageUnits.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storageUnits.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        this.storageUnits.getOrDefault(storageUnit, new ArrayList<>()).remove(item);

        if (this.contents(storageUnit).isEmpty()) {
            this.storageUnits.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> returnStorageUnits = new ArrayList<>();

        for (String storageUnit : this.storageUnits.keySet()) {
            returnStorageUnits.add(storageUnit);
        }

        return returnStorageUnits;
    }
}

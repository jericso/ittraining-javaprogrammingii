
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> vehicleRegistrations;

    public VehicleRegistry() {
        this.vehicleRegistrations = new HashMap<>();
    }

    public String get(LicensePlate licensePlate) {
        return this.vehicleRegistrations.get(licensePlate);
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.vehicleRegistrations.containsKey(licensePlate)) {
            return false;
        }

        this.vehicleRegistrations.put(licensePlate, owner);

        return true;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!this.vehicleRegistrations.containsKey(licensePlate)) {
            return false;
        }

        this.vehicleRegistrations.remove(licensePlate);

        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : this.vehicleRegistrations.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> ownersPrinted = new ArrayList<>();

        for (String owner : this.vehicleRegistrations.values()) {
            if (ownersPrinted.contains(owner)) {
                continue;
            }

            System.out.println(owner);
            ownersPrinted.add(owner);
        }
    }
}

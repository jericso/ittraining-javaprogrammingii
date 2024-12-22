
public class Main {

    public static void main(String[] args) {
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        VehicleRegistry vehicleRegistry = new VehicleRegistry();

        System.out.println(vehicleRegistry.add(li1, "Jason"));
        System.out.println(vehicleRegistry.add(li2, "Dennis"));
        System.out.println(vehicleRegistry.add(li3, "April"));
        System.out.println(vehicleRegistry.add(li1, "Jason"));

        System.out.println(vehicleRegistry.get(li1));
        System.out.println(vehicleRegistry.get(li2));
        System.out.println(vehicleRegistry.get(li3));

        System.out.println(vehicleRegistry.remove(li1));
        System.out.println(vehicleRegistry.remove(li2));
        System.out.println(vehicleRegistry.remove(li1));

        vehicleRegistry.printLicensePlates();
        vehicleRegistry.printOwners();
    }
}

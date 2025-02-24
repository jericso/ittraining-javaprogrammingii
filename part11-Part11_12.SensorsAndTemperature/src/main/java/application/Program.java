package application;

public class Program {

    public static void main(String[] args) {
//        StandardSensor ten = new StandardSensor(10);
//        StandardSensor minusFive = new StandardSensor(-5);
//
//        System.out.println(ten.read());
//        System.out.println(minusFive.read());
//
//        System.out.println(ten.isOn());
//        ten.setOff();
//        System.out.println(ten.isOn());

//        TemperatureSensor temperatureSensor = new TemperatureSensor();
//
//        try {
//            System.out.println(temperatureSensor.read());
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        temperatureSensor.setOn();
//        try {
//            System.out.println(temperatureSensor.read());
//        } catch (Exception e) {
//            System.out.println(e);
//        }

//        Sensor kumpula = new TemperatureSensor();
//        kumpula.setOn();
//        System.out.println("temperature in Kumpula " + kumpula.read() + " degrees Celsius");
//
//        Sensor kaisaniemi = new TemperatureSensor();
//        Sensor helsinkiVantaaAirport = new TemperatureSensor();
//
//        AverageSensor helsinkiRegion = new AverageSensor();
//        helsinkiRegion.addSensor(kumpula);
//        helsinkiRegion.addSensor(kaisaniemi);
//        helsinkiRegion.addSensor(helsinkiVantaaAirport);
//
//        helsinkiRegion.setOn();
//        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        
        Sensor kumpula = new TemperatureSensor();
        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();

        AverageSensor helsinkiRegion = new AverageSensor();
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

        helsinkiRegion.setOn();
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");

        System.out.println("readings: " + helsinkiRegion.readings());
    }
}

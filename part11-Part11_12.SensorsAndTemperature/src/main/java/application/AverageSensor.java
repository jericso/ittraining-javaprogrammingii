package application;

import java.util.List;
import java.util.ArrayList;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        if (this.sensors.isEmpty()) {
            return false;
        }

        return !this.sensors.stream()
                .map(sensor -> sensor.isOn())
                .anyMatch(isOn -> isOn == false);
    }

    @Override
    public void setOn() {
        this.sensors.stream().forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        this.sensors.stream().forEach(sensor -> sensor.setOff());
    }

    @Override
    public int read() {
        if (!this.isOn()) {
            throw new IllegalStateException("Cannot calculate average when a sensor is off or no sensors exist.");
        }

        int reading = (int) this.sensors.stream()
                .mapToInt(sensor -> sensor.read())
                .average()
                .getAsDouble();

        this.readings.add(reading);

        return reading;
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return this.readings;
    }
}

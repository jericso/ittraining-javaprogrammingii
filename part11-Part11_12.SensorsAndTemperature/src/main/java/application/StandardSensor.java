package application;

public class StandardSensor implements Sensor {

    private int value;

    public StandardSensor(int state) {
        this.value = state;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
    }

    @Override
    public void setOff() {
    }

    @Override
    public int read() {
        return this.value;
    }
}

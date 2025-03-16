interface SmartDevice {
    void turnOn();
    void turnOff();
}

public class Light implements SmartDevice {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " Light is ON");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " Light is OFF");
    }
}


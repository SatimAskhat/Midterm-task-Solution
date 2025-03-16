public class Light implements SmartDevice {
    private String location;
    private boolean isOn;

    public Light(String location) {
        this.location = location;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(" Свет в " + location + " включен");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(" Свет в " + location + " выключен");
    }

    @Override
    public String getStatus() {
        return "Свет в " + location + " - " + (isOn ? "Включен" : "Выключен");
    }
}

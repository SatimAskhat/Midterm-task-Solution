import java.util.ArrayList;
import java.util.List;

public class SmartHomeSystem {
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void turnAllOn() {
        System.out.println(" Turn on all devices...");
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    public void turnAllOff() {
        System.out.println(" Turn off all devices...");
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    public void showStatus() {
        System.out.println(" System status:" + devices.size() + " devices are connected.");
    }
}


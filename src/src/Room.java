import java.util.ArrayList;
import java.util.List;

public class Room implements SmartDevice {
    private String name;
    private List<SmartDevice> devices = new ArrayList<>();

    public Room(String name) {
        this.name = name;
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    @Override
    public void turnOn() {
        System.out.println(" Включаем комнату " + name);
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    @Override
    public void turnOff() {
        System.out.println(" Выключаем комнату " + name);
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    @Override
    public String getStatus() {
        return "Комната " + name + " содержит " + devices.size() + " устройств";
    }
}

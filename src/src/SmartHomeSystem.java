import java.util.ArrayList;
import java.util.List;

public class SmartHomeSystem {
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void turnAllOn() {
        System.out.println(" Включаем все устройства...");
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    public void turnAllOff() {
        System.out.println(" Выключаем все устройства...");
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    public void showStatus() {
        System.out.println(" Статус системы:");
        for (SmartDevice device : devices) {
            System.out.println(device.getStatus());
        }
    }
}

public abstract class Decorator implements SmartDevice {
    protected SmartDevice decoratedDevice;

    public Decorator(SmartDevice device) {
        this.decoratedDevice = device;
    }

    @Override
    public void turnOn() {
        decoratedDevice.turnOn();
    }

    @Override
    public void turnOff() {
        decoratedDevice.turnOff();
    }
}


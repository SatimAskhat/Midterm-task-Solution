public class LoggingDecorator extends Decorator {
    public LoggingDecorator(SmartDevice device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Logging: Turning on device");
        super.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Logging: Turning off device");
        super.turnOff();
    }
}


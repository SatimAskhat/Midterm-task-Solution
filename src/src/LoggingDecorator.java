public class LoggingDecorator extends Decorator {
    public LoggingDecorator(SmartDevice device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println(" Лог: Включение устройства");
        super.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println(" Лог: Выключение устройства");
        super.turnOff();
    }
}

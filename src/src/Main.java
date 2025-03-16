public class Main {
    public static void main(String[] args) {
        SmartHomeFactory factory = new BasicSmartHomeFactory();
        Light kitchenLight = factory.createLight("Kitchen");
        Light bedroomLight = factory.createLight("Bedroom");

        SmartDevice loggedKitchenLight = new LoggingDecorator(kitchenLight);

        Room home = new Room("Home");
        home.addDevice(loggedKitchenLight);
        home.addDevice(bedroomLight);

        LegacyLockSystem oldLock = new LegacyLockSystem();
        SmartDevice lockAdapter = new Adapter(oldLock);
        home.addDevice(lockAdapter);

        home.turnOn();
        home.turnOff();
    }
}


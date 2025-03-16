public class Main {
    public static void main(String[] args) {
        SmartHomeFactory factory = new BasicSmartHomeFactory();
        Light kitchenLight = factory.createLight("Кухня");
        Light bedroomLight = factory.createLight("Спальня");

        SmartDevice loggedKitchenLight = new LoggingDecorator(kitchenLight);
        LegacyLockSystem oldLock = new LegacyLockSystem();
        SmartDevice lockAdapter = new Adapter(oldLock);

        Room livingRoom = new Room("Гостиная");
        livingRoom.addDevice(bedroomLight);
        livingRoom.addDevice(loggedKitchenLight);

        SmartHomeSystem smartHome = new SmartHomeSystem();
        smartHome.addDevice(livingRoom);
        smartHome.addDevice(lockAdapter);

        smartHome.showStatus();
        smartHome.turnAllOn();
        smartHome.turnAllOff();
    }
}

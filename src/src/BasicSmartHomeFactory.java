public class BasicSmartHomeFactory implements SmartHomeFactory {
    @Override
    public Light createLight(String location) {
        return new Light(location);
    }
}

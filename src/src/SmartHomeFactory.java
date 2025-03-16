interface SmartHomeFactory {
    Light createLight(String name);
}

public class BasicSmartHomeFactory implements SmartHomeFactory {
    @Override
    public Light createLight(String name) {
        return new Light(name);
    }
}


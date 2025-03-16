public class Adapter implements SmartDevice {
    private LegacyLockSystem legacyLock;

    public Adapter(LegacyLockSystem legacyLock) {
        this.legacyLock = legacyLock;
    }

    @Override
    public void turnOn() {
        legacyLock.unlock();
    }

    @Override
    public void turnOff() {
        legacyLock.lock();
    }

    @Override
    public String getStatus() {
        return legacyLock.getStatus();
    }
}

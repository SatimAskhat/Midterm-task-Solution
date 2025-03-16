class LegacyLockSystem {
    public void activateLock() {
        System.out.println("Legacy Lock System: Locking doors");
    }

    public void deactivateLock() {
        System.out.println("Legacy Lock System: Unlocking doors");
    }
}

public class Adapter implements SmartDevice {
    private LegacyLockSystem legacyLock;

    public Adapter(LegacyLockSystem legacyLock) {
        this.legacyLock = legacyLock;
    }

    @Override
    public void turnOn() {
        legacyLock.activateLock();
    }

    @Override
    public void turnOff() {
        legacyLock.deactivateLock();
    }
}


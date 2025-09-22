public class TestDriver {
    public static void main(String[] args) {
        SmartDeviceFactory brand_a_factory = new BrandAFactory();
        SmartDeviceFactory brand_b_factory = new BrandBFactory();
        brand_a_factory.createSmartBulb(); // a smart bulb is created from brand a
        brand_b_factory.createSmartLock(); // a smart lock is created from brand b
    }
}

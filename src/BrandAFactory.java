public class BrandAFactory implements SmartDeviceFactory {
    @Override
    public SmartBulb createSmartBulb() {
        SmartBulb brand_a_smart_bulb = new BrandASmartBulb(); // polymorphism to show BrandASmartBulb parent classing
        brand_a_smart_bulb.setPowerUsage(); // set power usage after creation
        return brand_a_smart_bulb;
    }
    @Override
    public SmartLock createSmartLock() {
        SmartLock brand_a_smart_lock = new BrandASmartLock(); // polymorphism to show BrandASmartLock parent classing
        brand_a_smart_lock.setBatteryConsumption(); // set battery consumption after creation
        return brand_a_smart_lock;
    }
}

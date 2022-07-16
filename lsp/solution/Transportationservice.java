package lsp.solution;

/*
 * 1. Refactor original Transportationservice, and remove engine type & calculateTransportationDevicePriceBasedOnEngineType method.
 * 2. Use abstraction to create two new classes by inheriting Transportationservice which provides name and speed information of the transportation device.
    a) With an engine 'TransportationdeviceWithEngine'
    b) Without an engine 'TransportationDeviceWithoutEngine' 
 * 3. Car and Cycle will leverage newly created class in point 2.
 * 4. Calculate device engine(Car & Cycle) price based on engine type and brand respectively
 */
public class Transportationservice {
    private String name;
    private double speed;
 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
}

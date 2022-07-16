package lsp.problem;

/*
 * SLP: As per SLP , child should be able to do what parent can do , in this particular case, calculateTransportationDevicePriceBasedOnEngineType.
 * Transportationdevice is a base class which can be used by any transportaion device like card, cycle,tracktor,train or truck
 */
public class Transportationdevice {

    private String name;
    private double speed;
    private String engineType;
    private int price;
   
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
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
    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int calculateTransportationDevicePriceBasedOnEngineType(String engineType){
        return price;
    }


    
}

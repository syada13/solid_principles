package lsp.solution;

public class TransportationdeviceWithEngine extends Transportationservice {

    private String engineType;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int calculateTransportationDevicePriceBasedOnEngineType(String engineType){
        return getPrice();
    }
}

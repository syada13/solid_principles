package lsp.solution;

public class TransportationDeviceWithoutEngine extends Transportationservice{
    private int price;
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   

    public int calculateTransportationDevicePriceWithoutEngineType(String brand){   
        return getPrice();
    }



    
}

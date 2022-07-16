package lsp.solution;

public class Cycle extends TransportationDeviceWithoutEngine{

     int price= 20000;

    @Override
    public int calculateTransportationDevicePriceWithoutEngineType(String brand){
        // Calculate price of Cycle based on  brand NOT engine type.  
        if(!brand.equalsIgnoreCase(" ") & brand.equalsIgnoreCase("Hero")){
            this.price = this.price + 5000;
        }else{
            this.price = this.price + 2000;
        }
        return price;

    }
    
}

package lsp.problem;

public class Car extends Transportationdevice{
    public int price = 50000;

    @Override
    public int calculateTransportationDevicePriceBasedOnEngineType(String engineType){
        // Calculate price of Car based on type of the engine. Price of the car depends on engine type.  
        if(!engineType.equalsIgnoreCase(" ") && engineType.equalsIgnoreCase("CNG")){
            this.price = this.price + 50000;
        }else{
            this.price = this.price + 100000;
        }
        return price;

    }
    
}

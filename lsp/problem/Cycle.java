package lsp.problem;
/*
SLP: As per SLP child should be able to do what parent can do in this case calculateTransportationDevicePriceBasedOnEngineType.

The Cycle class is a child of the Transportationdevice , and donen't have the engine type.
So, it can't calculate true price of Cycle.If it overrides the calculateTransportationDevicePriceBasedOnEngineType method, it violates SLP. 
*/
public class Cycle extends Transportationdevice {
    int price = 0;
   
    @Override
    public int calculateTransportationDevicePriceBasedOnEngineType(String engineType){
        //can't calculate true price as cycle doesn't have engine.
        return price;
    }   
    
}
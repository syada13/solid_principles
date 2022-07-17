package com.solid.dip.solution;

public class PayPalPaymentService  implements PaymentService{

    PayPalClient payPalClient;

    public void validate(String inputJson) throws Exception{
        // Implementation of validating Paypal account
        // payPalClient = ...
    }


    public void makePayment(double amount) throws Exception{
        // Implementation of making payment PayPal 
        // payPalClient.makePayment(amount);
    }
    
}

package com.solid.dip.solution;

public class CreditCardPaymentService implements PaymentService  {

    CreditCardClient creditCardClient;

    public void validate(String inputJson) throws Exception{
        // Credit Card validation logic
        // creditCardClient = ....
    }

    public void makePayment(double amount) throws Exception{
        // Make payment with credit card logic
        // creditCardClient.makePayment(amount)
    }
    
}

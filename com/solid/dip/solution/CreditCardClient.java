package com.solid.dip.solution;

public class CreditCardClient {
    String cardNo;
    int expMonth;
    int expYear;
    String cvc;

    CreditCardClient(String cardNo, int expMonth, int expYear, String cvc){
        this.cardNo = cardNo;
        this.expMonth = expMonth;
        this.expMonth = expYear;
        this.cvc = cvc;
    }

    public void validate() throws Exception {
       // Credit card validation logic implementation
    }
    
    public void makePayment(double amount) throws Exception{
        // Make payment with credit card implementation
    }
}

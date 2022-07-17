package com.solid.dip.problem;

public class CreditCard {
    String cardNo;
    int expMonth;
    int expYear;
    String cvc;

    CreditCard(String cardNo, int expMonth, int expYear, String cvc){
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

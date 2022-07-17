package com.solid.dip.solution;

public class PayPalClient {
    String username;
    String password;

    public PayPalClient(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void validate(String inputJson) throws Exception {
      // PayPal client account validation logic implementation
    }
 
    public void makePayment(double amount) throws Exception{
     // PayPal payment logic
    }

}    

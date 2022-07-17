package com.solid.dip.problem;

/*
 * PaymentSystem works well. 
 * However, one day your manager asked you to modify the system to make it support PayPal as well. 
 * Which part of the code we will have to change to support making payment with PayPal?
 * 
 * a) Line#18, the target class for mapper in this case 'CreditCard.class' would change . 
 * We would need PayPal class with attributes like userName and password
 * 
 * b) The part of validating userInfo and making payment would change at lines 21 and 24 b/c making payment with PayPal is different than making payment with credit card
 * 
 * So pretty much everything. If we were to make payments in other ways: Debit card, Gift card, Venmo, Stripe, Apple Pay…, we will have to keep modifying the code. That will be a lot of work to do!
 * 
 * 
 * What’s wrong with the original code? 
 * Instantiating CreditCard object inside the method of PaymentSystem class indicates that we are tightly coupling our payment system to this particular payment method. 
 * That is a bad practice should be avoided!
 */
public class PaymentSystem {
    public void makePayment(String inputJson, double amount) throws Exception {
        
        // Convert Json String into CreditCard object
        ObjectMapper mapper = new ObjectMapper();
        CreditCard creditCard = mapper.readValues(inputJson, CreditCard.class);

        // validate credit card
        creditCard.validate();

        // make payment with credit card
        creditCard.makePayment(amount);
    }
    
}

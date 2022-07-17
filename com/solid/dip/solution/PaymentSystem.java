package com.solid.dip.solution;
/*
 * 
Fix the code:
 According to this design principle, we should replace the concrete implementation(CreditCard) with an abstract interface(PaymentService), such that our high level module(PaymentSystem) is not tightly coupled to any concrete class.
 To make payment using different methods, we can pass in a different implementation of such interface!
 */
public class PaymentSystem{

   private PaymentService paymentService;

   public PaymentSystem(PaymentService paymentService){
      this.paymentService = paymentService;
   }

   public void makePayment(String inputJson, double amount) throws Exception{
      paymentService.validate(inputJson);
      paymentService.makePayment(amount);
    }
    
}

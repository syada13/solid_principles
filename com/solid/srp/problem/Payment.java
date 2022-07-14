package com.solid.srp.problem;

import java.util.List;

import com.solid.srp.utilities.LatePaymentInterest;

/* Single Responsibility Princliple: This principle states that a class should only have one responsibility. 
For instance, imagine an online store that issues its cards for its customers, and from the beginning,
the Payment and Card teams are in mutual agreement to apply for interest and lock cards from customers who are in late payments for 14 days or more.
 In the following code, we have the first design of the Payment Class, which supports both requirements.

The Problem: The Class has more than one responsibility i.e. appling late payment interest and locking card

Suddenly, the Cards team wants to change the validation to 10 days. However, the Payments team manages other policies related to when interests by late payment are applied.
As a result, the Payments team disagrees with the Cards team. Moreover, both teams are stuck on how to proceed.

This scenario is a clear example of how this Class design violates the Single Responsibility Principle. 
The Payment class has more than one reason to change and breaks the Payments team's business logic if they accept the Cards team's requirement.
*/
public class Payment {
    LatePaymentInterest LatePaymentInterestCal;
    public static final int MAX_DAYS = 14;
    
    public void batch(List<Customer> customers){
        for (Customer customer: customers){
            int nDays = LatePaymentInterestCal.latePaymentDays(customer);
            if(nDays >= MAX_DAYS){
                applyLatePaymentInterest(customer);
                lockcard(customer);
            }

        }

    }

    
    

    private void applyLatePaymentInterest(Customer customer) {
        System.out.println("Calculating late payment interest");
    }

    private void lockcard(Customer customer) {
        System.out.println("Lock the customer card");
     }

}

package com.solid.srp.solution;

import java.util.List;
import com.solid.srp.problem.Customer;
import com.solid.srp.utilities.LatePaymentInterest;


public class Card {
    LatePaymentInterest LatePaymentInterestCal;
    public static final int MAX_DAYS = 10;

    public void batch(List<Customer> customers){
        for (Customer customer: customers){
            int nDays = LatePaymentInterestCal.latePaymentDays(customer);
            if(nDays >= MAX_DAYS){
                lockcard(customer);
            }

        }

    }
    private void lockcard(Customer customer) {
        System.out.println("Lock the customer card");
    }
}

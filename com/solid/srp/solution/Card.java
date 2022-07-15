package com.solid.srp.solution;

import java.util.List;
import com.solid.srp.problem.Customer;
import com.solid.srp.utilities.LatePaymentInterest;


public class Card {
    private LatePaymentInterest latePaymentInterestCal;
    public static final int MAX_DAYS = 10;

    public Card(LatePaymentInterest latePaymentInterestCal){
        this.latePaymentInterestCal = latePaymentInterestCal;

    }

    public void batch(List<Customer> customers){
        for (Customer customer: customers){
            int nDays = latePaymentInterestCal.latePaymentDays(customer);
            if(nDays >= MAX_DAYS){
                lockcard(customer);
            }

        }

    }
    private void lockcard(Customer customer) {
        System.out.println("Lock the customer card");
    }
}

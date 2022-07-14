package com.solid.srp.solution;

import java.util.List;
import com.solid.srp.problem.Customer;
import com.solid.srp.utilities.LatePaymentInterest;


public class Payment {
    LatePaymentInterest LatePaymentInterestCal;
    public static final int MAX_DAYS = 14;

    public void batch(List<Customer> customers){
        for(Customer customer: customers){
            int nDays = LatePaymentInterestCal.latePaymentDays(customer);
            if(nDays >= MAX_DAYS){
                applyLatePaymentInterest(customer);
            }
        }
    }


    private void applyLatePaymentInterest(Customer customer) {
        System.out.println("Calculating late payment interest");
    }
}

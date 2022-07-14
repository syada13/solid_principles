package com.solid.srp.utilities;

import com.solid.srp.problem.Customer;

public class LatePaymentInterest {
    public static final int LATE_PAYMENT_DAY = 16;
    Customer customer;

    public int latePaymentDays(Customer customer) {
        return LATE_PAYMENT_DAY;
    }   
    
}

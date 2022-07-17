package com.solid.dip.solution;
/*
Dependency inversion principle(DIP):
To fix this problem, we now introduce the dependency inversion principle. In object-oriented design, the dependency inversion principle is a specific methodology for loosely coupling software modules. The principle states:
1. High-level modules should not depend upon low-level modules. Both should depend on abstractions (interfaces).
    a) Low-level module implements a basic functionality can be used anywhere
    b) High-level module is a module implements some complex business logic
2. Abstractions should not depend on details (implementations). Details should depend on abstractions.

The PaymentService interface simply specifies behaviors that need to be implemented by all payment methods stated below
   a) CreditCardPaymentService
   b) PaypalPaymentService

Summary
 To summarize, instantiating objects (with new keyword) inside the method usually indicate tight coupling of the modules. In other words, changes in one class will force the changes in the classes it closely depend on. It trades software extensibility and scalability for its simplicity.
 On the contrary, loose coupling means classes work independently. It can be achieved by applying the dependency inversion principle, usually with the help of Interfaces. Classes interact through interfaces rather than some concrete implementations to increases the flexibility of a system, and make the code more ‘robust’.
 * 
 */
public interface PaymentService {
    public void validate(String inputJson) throws Exception;
    public void makePayment(double amount) throws Exception;
    
}

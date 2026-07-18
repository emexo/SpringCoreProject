package com.springcore.compoentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import payment.Payment;

@Component
@ComponentScan(basePackages = "payment")
public class Order {
    @Autowired
    private Payment payment;

    public void placeOrder() {
        System.out.println("Order placed");
        payment.processPayment();
    }
}

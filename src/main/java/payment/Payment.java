package payment;

import org.springframework.stereotype.Component;

@Component
public class Payment {
    public void processPayment() {
        System.out.println("Payment processed");
    }
}

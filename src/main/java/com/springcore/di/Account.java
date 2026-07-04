package com.springcore.di;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Log4j2
@Component
public class Account {
    private int accountNumber;
    private String accountType;

    @Autowired
    private Customer customer;

    public void displayAccountInfo() {
        log.info("Account Number: " + accountNumber);
        log.info("Account Type: " + accountType);
        if (customer != null) {
            customer.displayCustomerInfo();
        } else {
            log.warn("Customer information is not available.");
        }
    }
}

package com.springcore.di;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Getter
@Log4j2
@Setter
@Component
public class Customer {
    private String name;
    private int age;

    public void displayCustomerInfo() {
        log.info("Customer Name: " + name);
        log.info("Customer Age: " + age);
    }

}

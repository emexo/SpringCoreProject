package com.springcore.di1;

import org.springframework.stereotype.Component;

@Component
public class Honda implements Vehicle {
    @Override
    public void engine() {
        System.out.println("Honda engine started");
    }
}

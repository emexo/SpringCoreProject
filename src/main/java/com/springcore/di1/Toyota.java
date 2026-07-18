package com.springcore.di1;

import org.springframework.stereotype.Component;

@Component
public class Toyota implements Vehicle {
    @Override
    public void engine() {
        System.out.println("Toyota engine started");
    }
}

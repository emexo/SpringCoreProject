package com.springcore.di1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.di1");
        Driver driver = context.getBean(Driver.class);
        driver.drive();
    }
}

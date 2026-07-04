package com.springcore.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.javabased");
        Date currentDate =  context.getBean("currentDate", Date.class);
        System.out.println("Current Date: " + currentDate);
    }
}

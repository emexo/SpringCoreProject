package com.springcore.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.di");
        Account account = context.getBean("account", Account.class);
        account.setAccountNumber(123456);
        account.setAccountType("Savings");
        account.getCustomer().setName("John Doe");
        account.getCustomer().setAge(30);
        account.displayAccountInfo();
    }
}

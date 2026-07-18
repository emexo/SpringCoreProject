package com.springcore.propertyfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.propertyfile");
        DbConnection dbConnection = context.getBean(DbConnection.class);
        dbConnection.connect();
    }
}

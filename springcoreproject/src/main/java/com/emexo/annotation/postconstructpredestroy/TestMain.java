package com.emexo.annotation.postconstructpredestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.emexo.ioc.annotation");

        EmployeeDAO employeeDAO  = context.getBean("employeeDAO", EmployeeDAO.class);
        //employeeDAO.getDBConnection();
        context.close();
    }
}

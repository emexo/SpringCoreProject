package com.springcore.scope;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

/**
 * In this example, we have a Spring application that defines a bean of type Employee with singleton scope.
 * The Main class retrieves the Employee bean from the application context and sets its name to "John Doe".
 * Since the Employee bean is defined with singleton scope, any subsequent retrievals of the Employee bean will return the same instance,
 * and the name will remain "John Doe" unless explicitly changed.
 */
@Log4j2
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.scope");
        Employee employee1 = context.getBean(Employee.class);

        log.info(employee1.hashCode());

        Employee employee2 = context.getBean(Employee.class);

        log.info(employee2.hashCode());
    }
}

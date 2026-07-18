package com.springcore.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * prototype scope: a new instance of the bean will be created each time it is requested from the application context.
 * prototype scope is useful when you want to have multiple instances of a bean with different states or configurations.
 */

@Component
@Scope("prototype")
public class Employee {
    private String name;

    public String getName() {
        return name;
    }
}

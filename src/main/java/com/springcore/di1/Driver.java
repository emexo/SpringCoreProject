package com.springcore.di1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class Driver {

    @Inject
    private Vehicle honda;

    public Driver(Vehicle honda) {
        this.honda = honda;
    }

    public void drive() {
            honda.engine();
    }
}

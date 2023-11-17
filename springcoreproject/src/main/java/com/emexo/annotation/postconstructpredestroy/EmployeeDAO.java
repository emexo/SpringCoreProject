package com.emexo.annotation.postconstructpredestroy;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class EmployeeDAO {

    @PostConstruct
    public void getDBConnection(){
        System.out.println("### DB Connection ###");
    }

    @PreDestroy
    public void closeDBConnection(){
        System.out.println("### Close DB Connection ###");
    }
}

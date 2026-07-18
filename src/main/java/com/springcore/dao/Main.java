package com.springcore.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.dao");
        StationDAO stationDAO = context.getBean("stationDAO", StationDAO.class);

        Station station = new Station("KR Puram", "KR00L", "Bangalore");
        stationDAO.save(station);
    }
}

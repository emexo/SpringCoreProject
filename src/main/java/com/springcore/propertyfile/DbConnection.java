package com.springcore.propertyfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:db.properties")  // Load properties from db.properties file
@Component
public class DbConnection {
    @Value("${db.url}")  // Inject the value of db.url from the properties file
    private String dbUrl;

    @Value("${db.username}")  // Inject the value of db.username from the properties file
    private String dbUsername;

    @Value("${db.password}")  // Inject the value of db.password from the properties file
    private String dbPassword;

    public void connect() {
        System.out.println("Connecting to database...");
        System.out.println("URL: " + dbUrl);
        System.out.println("Username: " + dbUsername);
        System.out.println("Password: " + dbPassword);
    }
}

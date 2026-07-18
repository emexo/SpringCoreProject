package com.springcore.dao;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@PropertySource("classpath:db.properties")  // Load properties from db.properties file
@Configuration
@Log4j2
public class DBConnection {

    @Value("${db.url}")  // Inject the value of db.url from the properties file
    private String dbUrl;

    @Value("${db.username}")  // Inject the value of db.username from the properties file
    private String dbUsername;

    @Value("${db.password}")  // Inject the value of db.password from the properties file
    private String dbPassword;


    @Bean("jdbcTemplate")
    public JdbcTemplate getConnection(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(dbUsername);
        dataSource.setPassword(dbPassword);

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        log.info("Database connection established successfully.");
        return jdbcTemplate;
    }
}

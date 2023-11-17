package com.emexo.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:db.properties")
public class DBConfiguration {

    @Value("${db.url}")
    private String url;

    @Value("${db.driverClassName}")
    private String driverClassName;

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    @Bean("jdbcTemplate")
    public JdbcTemplate getJdbcTemplate(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }


}

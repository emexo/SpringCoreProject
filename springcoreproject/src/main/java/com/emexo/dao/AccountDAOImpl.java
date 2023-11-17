package com.emexo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(Account account) {
        String query = "Insert into account(account_name, account_type) values(?,?)";
        int response = jdbcTemplate.update(query, account.getAccountName(), account.getAccountType());
        return  response;
    }
}

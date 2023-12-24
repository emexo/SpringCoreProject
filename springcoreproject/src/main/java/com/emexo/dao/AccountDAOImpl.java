package com.emexo.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class AccountDAOImpl implements AccountDAO{
    private static final Logger log = LogManager.getLogger(AccountDAOImpl.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(Account account) {
        log.debug("Inside the AccountDAOImpl.save, Account no:{}, and account name:{}", account.getAccountNo(), account.getAccountName());
        String query = "Insert into account(account_name, account_type) values(?,?)";
        int response = jdbcTemplate.update(query, account.getAccountName(), account.getAccountType());
        return  response;
    }
}

package com.emexo.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.emexo.dao");

        AccountDAO accountDAO = applicationContext.getBean("accountDAOImpl", AccountDAOImpl.class);

        Account account = new Account();
        account.setAccountName("Regu");
        account.setAccountType("Saving");

        accountDAO.save(account);
    }
}

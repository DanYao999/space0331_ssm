package com.my.service;

import com.my.domain.Account;

import java.util.List;

/**
 * @author daniel
 * @create 2022-03-31 11:07
 */
public interface AccountService {
    public void save(Account account);

    public List<Account> findAll();
}

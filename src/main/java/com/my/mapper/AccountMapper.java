package com.my.mapper;

import com.my.domain.Account;

import java.util.List;

/**
 * @author daniel
 * @create 2022-03-31 11:06
 */
public interface AccountMapper {

    public void save(Account account);

    public List<Account> findAll();
}

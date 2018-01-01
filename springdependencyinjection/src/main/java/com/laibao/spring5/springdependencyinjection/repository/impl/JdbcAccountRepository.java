package com.laibao.spring5.springdependencyinjection.repository.impl;

import com.laibao.spring5.springdependencyinjection.domain.Account;
import com.laibao.spring5.springdependencyinjection.repository.AccountRepository;
import org.springframework.stereotype.Repository;

/**
 * @author laibao wang
 * @date 2018-01-01
 * @version 1.0
 */
@Repository
public class JdbcAccountRepository implements AccountRepository{
    @Override
    public Account findByAccountId(long id) {
        return new Account(id,"JinGe");
    }
}

package com.laibao.spring5.springintroductionandpatterns.repository.impl;

import com.laibao.spring5.springintroductionandpatterns.domain.Account;
import com.laibao.spring5.springintroductionandpatterns.repository.AccountRepository;
import org.springframework.stereotype.Repository;

/**
 * @author laibao wang
 * @date 2017-12-30
 * @version 1.0
 */
@Repository
public class JdbcAccountRepository implements AccountRepository{

    @Override
    public Account findByAccountId(long id) {
        return new Account(id, "JinGe");
    }
}

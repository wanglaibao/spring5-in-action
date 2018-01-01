package com.laibao.spring5.springdependencyinjection.repository;

import com.laibao.spring5.springdependencyinjection.domain.Account;

/**
 * @author laibao wang
 * @date 2018-01-01
 * @version 1.0
 */
public interface AccountRepository {
    Account findByAccountId(long id);
}

package com.laibao.spring5.springintroductionandpatterns.repository;

import com.laibao.spring5.springintroductionandpatterns.domain.Account;

/**
 * @author laibao wang
 * @date 2017-12-30
 * @version 1.0
 */
public interface TransferRepository {
    void transfer(Account accountA, Account accountB, double amount);
}

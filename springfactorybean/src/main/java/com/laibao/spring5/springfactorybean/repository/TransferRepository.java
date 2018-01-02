package com.laibao.spring5.springfactorybean.repository;

import com.laibao.spring5.springfactorybean.domain.Account;

/**
 * @author laibao wang
 * @date 2018-01-02
 * @version 1.0
 */
public interface TransferRepository {
    void transfer(Account accountA, Account accountB, double amount);
}

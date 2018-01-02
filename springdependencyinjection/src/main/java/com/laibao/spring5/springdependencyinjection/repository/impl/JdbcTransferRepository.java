package com.laibao.spring5.springdependencyinjection.repository.impl;

import com.laibao.spring5.springdependencyinjection.domain.Account;
import com.laibao.spring5.springdependencyinjection.repository.TransferRepository;
import org.springframework.stereotype.Repository;

/**
 * @author laibao wang
 * @date 2018-01-01
 * @version 1.0
 */
@Repository
public class JdbcTransferRepository implements TransferRepository{
    @Override
    public void transfer(Account accountA, Account accountB, double amount) {
        System.out.println("Transfering amount from account A to B via JDBC implementation");
        System.out.println("accountA's name is "+accountA.getName()+ " and accountB's name is" + accountB.getName()+ " and transfered money is "+ amount);
    }
}

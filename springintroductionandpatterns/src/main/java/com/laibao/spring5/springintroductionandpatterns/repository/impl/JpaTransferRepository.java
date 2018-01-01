package com.laibao.spring5.springintroductionandpatterns.repository.impl;

import com.laibao.spring5.springintroductionandpatterns.domain.Account;
import com.laibao.spring5.springintroductionandpatterns.repository.TransferRepository;
import org.springframework.stereotype.Repository;

/**
 * @author laibao wang
 * @date 2017-12-30
 * @version 1.0
 */
@Repository
public class JpaTransferRepository implements TransferRepository{

    @Override
    public void transfer(Account accountA, Account accountB, double amount) {
        System.out.println("Transfering amount from account A to B via JPA implementation");
        System.out.println("accountA's name is "+accountA.getName()+ " and accountB's name is" + accountB.getName()+ " and transfered money is "+ amount);
    }
}

package com.laibao.spring5.springdependencyinjection.service.impl;

import com.laibao.spring5.springdependencyinjection.domain.Account;
import com.laibao.spring5.springdependencyinjection.repository.AccountRepository;
import com.laibao.spring5.springdependencyinjection.repository.TransferRepository;
import com.laibao.spring5.springdependencyinjection.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author laibao wang
 * @date 2018-01-01
 * @version 1.0
 */

public class TransferServiceImpl implements TransferService{

    private final AccountRepository accountRepository;

    private final TransferRepository transferRepository;

    public TransferServiceImpl(AccountRepository accountRepository, TransferRepository transferRepository) {
        this.accountRepository = accountRepository;
        this.transferRepository = transferRepository;
    }

    @Override
    public void transferAmount(long accountAId, long accountBId, double amount) {
        Account accountA = accountRepository.findByAccountId(accountAId);
        Account accountB = accountRepository.findByAccountId(accountBId);
        transferRepository.transfer(accountA, accountB, amount);
    }
}

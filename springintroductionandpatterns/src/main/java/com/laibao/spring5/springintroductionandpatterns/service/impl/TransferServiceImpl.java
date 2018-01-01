package com.laibao.spring5.springintroductionandpatterns.service.impl;

import com.laibao.spring5.springintroductionandpatterns.domain.Account;
import com.laibao.spring5.springintroductionandpatterns.repository.AccountRepository;
import com.laibao.spring5.springintroductionandpatterns.repository.TransferRepository;
import com.laibao.spring5.springintroductionandpatterns.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author laibao wang
 * @date 2017-12-30
 * @version 1.0
 */
@Service
public class TransferServiceImpl implements TransferService {

    private final AccountRepository accountRepository;

    private final TransferRepository transferRepository;

    @Autowired
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

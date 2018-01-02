package com.laibao.spring5.springfactorybean.service.impl;

import com.laibao.spring5.springfactorybean.domain.Account;
import com.laibao.spring5.springfactorybean.repository.AccountRepository;
import com.laibao.spring5.springfactorybean.repository.TransferRepository;
import com.laibao.spring5.springfactorybean.service.TransferService;

/**
 * @author laibao wang
 * @date 2018-01-02
 * @version 1.0
 */
public class TransferServiceImpl implements TransferService {

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

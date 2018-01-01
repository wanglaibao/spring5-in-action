package com.laibao.spring5.springintroductionandpatterns.service;

/**
 * @author laibao wang
 * @date 2017-12-30
 * @version 1.0
 */
public interface TransferService {
    void transferAmount(long accountAId, long accountBId, double amount);
}

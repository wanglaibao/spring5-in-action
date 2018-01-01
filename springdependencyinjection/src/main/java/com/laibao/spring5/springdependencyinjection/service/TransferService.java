package com.laibao.spring5.springdependencyinjection.service;

/**
 * @author laibao wang
 * @date 2018-01-01
 * @version 1.0
 */
public interface TransferService {
    void transferAmount(long accountAId, long accountBId, double amount);
}

package com.laibao.spring5.springfactorybean.service;

/**
 * @author laibao wang
 * @date 2018-01-02
 * @version 1.0
 */
public interface TransferService {
    void transferAmount(long accountAId, long accountBId, double amount);
}

package com.laibao.spring5.springfactorybean.repository.impl;

import com.laibao.spring5.springfactorybean.repository.TransferRepository;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author laibao wang
 * @date 2018-01-02
 * @version 1.0
 */
public class JdbcTransferRepositoryFactoryBean implements FactoryBean<TransferRepository> {

    @Override
    public TransferRepository getObject() throws Exception {
        return new JdbcTransferRepository();
    }

    @Override
    public Class<?> getObjectType() {
        return TransferRepository.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}

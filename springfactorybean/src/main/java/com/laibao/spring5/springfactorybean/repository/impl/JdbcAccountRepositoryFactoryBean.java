package com.laibao.spring5.springfactorybean.repository.impl;

import com.laibao.spring5.springfactorybean.repository.AccountRepository;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author laibao wang
 * @date 2018-01-02
 * @version 1.0
 */
public class JdbcAccountRepositoryFactoryBean implements FactoryBean<AccountRepository>{

    @Override
    public AccountRepository getObject() throws Exception {
        return new JdbcAccountRepository();
    }

    @Override
    public Class<?> getObjectType() {
        return AccountRepository.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}

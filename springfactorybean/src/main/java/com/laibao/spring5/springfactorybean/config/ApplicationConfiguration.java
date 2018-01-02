package com.laibao.spring5.springfactorybean.config;

import com.laibao.spring5.springfactorybean.repository.AccountRepository;
import com.laibao.spring5.springfactorybean.repository.TransferRepository;
import com.laibao.spring5.springfactorybean.repository.impl.JdbcAccountRepositoryFactoryBean;
import com.laibao.spring5.springfactorybean.repository.impl.JdbcTransferRepositoryFactoryBean;
import com.laibao.spring5.springfactorybean.service.TransferService;
import com.laibao.spring5.springfactorybean.service.impl.AnnotationTransferServiceImpl;
import com.laibao.spring5.springfactorybean.service.impl.TransferServiceImpl;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author laibao wang
 * @date 2018-01-02
 * @version 1.0
 */
@Configuration
@ComponentScan(basePackageClasses = {TransferService.class, AccountRepository.class})
public class ApplicationConfiguration {

    @Bean
    public TransferService annotationTransferService() throws Exception {
        return new AnnotationTransferServiceImpl(accountRepository().getObject(), transferRepository().getObject());
    }

    @Bean
    public FactoryBean<AccountRepository> accountRepository(){
        return  new JdbcAccountRepositoryFactoryBean();
    }

    @Bean
    public FactoryBean<TransferRepository> transferRepository(){
        return  new JdbcTransferRepositoryFactoryBean();
    }
}

package com.laibao.spring5.springintroductionandpatterns.config;

import com.laibao.spring5.springintroductionandpatterns.repository.AccountRepository;
import com.laibao.spring5.springintroductionandpatterns.repository.TransferRepository;
import com.laibao.spring5.springintroductionandpatterns.repository.impl.JdbcAccountRepository;
import com.laibao.spring5.springintroductionandpatterns.repository.impl.JdbcTransferRepository;
import com.laibao.spring5.springintroductionandpatterns.service.TransferService;
import com.laibao.spring5.springintroductionandpatterns.service.impl.TransferServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

/**
 * @author laibao wang
 * @date 2017-12-30
 * @version 1.0
 */
@Configuration
@ComponentScan
public class ApplicationConfiguration {

    @Bean
    public TransferService transferService(){
        return new TransferServiceImpl(accountRepository(), transferRepository());
    }


    public AccountRepository accountRepository() {
        return new JdbcAccountRepository();
    }


    public TransferRepository transferRepository() {
        return new JdbcTransferRepository();
    }
}

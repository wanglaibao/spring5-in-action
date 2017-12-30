package com.laibao.spring5.springintroductionandpatterns.config;

import com.laibao.spring5.springintroductionandpatterns.aspect.LoggingAspect;
import com.laibao.spring5.springintroductionandpatterns.repository.AccountRepository;
import com.laibao.spring5.springintroductionandpatterns.repository.TransferRepository;
import com.laibao.spring5.springintroductionandpatterns.repository.impl.JdbcAccountRepository;
import com.laibao.spring5.springintroductionandpatterns.repository.impl.JdbcTransferRepository;
import com.laibao.spring5.springintroductionandpatterns.service.TransferService;
import com.laibao.spring5.springintroductionandpatterns.service.impl.TransferServiceImpl;
import org.springframework.context.annotation.*;

/**
 * @author laibao wang
 * @date 2017-12-30
 * @version 1.0
 */

@EnableAspectJAutoProxy
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

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}

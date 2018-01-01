package com.laibao.spring5.springdependencyinjection.config;

import com.laibao.spring5.springdependencyinjection.repository.AccountRepository;
import com.laibao.spring5.springdependencyinjection.repository.TransferRepository;
import com.laibao.spring5.springdependencyinjection.repository.impl.JdbcAccountRepository;
import com.laibao.spring5.springdependencyinjection.repository.impl.JdbcTransferRepository;
import com.laibao.spring5.springdependencyinjection.service.TransferService;
import com.laibao.spring5.springdependencyinjection.service.impl.AnnotationTransferServiceImpl;
import com.laibao.spring5.springdependencyinjection.service.impl.TransferServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author laibao wang
 * @date 2018-01-01
 * @version 1.0
 */
@Configuration
@ComponentScan(basePackageClasses={TransferService.class,AccountRepository.class})
public class ApplicationConfiguration {

    @Bean
    public TransferService annotationTransferService(){
        return new AnnotationTransferServiceImpl(accountRepository(), transferRepository());
    }
    @Bean
    public AccountRepository accountRepository() {
        return new JdbcAccountRepository();
    }
    @Bean
    public TransferRepository transferRepository() {
        return new JdbcTransferRepository();
    }
}

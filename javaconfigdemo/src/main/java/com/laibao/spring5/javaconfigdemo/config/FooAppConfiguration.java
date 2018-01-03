package com.laibao.spring5.javaconfigdemo.config;

import com.laibao.spring5.javaconfigdemo.service.FooService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author laibao wang
 * @date 2018-01-03
 * @version 1.0
 */
@Configuration
public class FooAppConfiguration {

    @Bean
    public FooService fooService() {
        return new FooService();
    }
}

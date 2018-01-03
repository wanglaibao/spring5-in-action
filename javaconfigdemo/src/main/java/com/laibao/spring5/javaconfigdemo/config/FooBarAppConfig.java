package com.laibao.spring5.javaconfigdemo.config;

import com.laibao.spring5.javaconfigdemo.service.Bar;
import com.laibao.spring5.javaconfigdemo.service.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author laibao wang
 * @date 2018-01-03
 * @version 1.0
 */

@Configuration
public class FooBarAppConfig {

    @Bean(initMethod = "init")
    public Foo foo(){
        return new Foo();
    }

    @Bean(destroyMethod = "cleanUp")
    public Bar bar() {
        return new Bar();
    }
}

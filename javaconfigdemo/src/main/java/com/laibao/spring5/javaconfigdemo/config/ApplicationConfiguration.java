package com.laibao.spring5.javaconfigdemo.config;

/**
 * @author laibao wang
 * @date 2018-01-02
 * @version 1.0
 */

import com.laibao.spring5.javaconfigdemo.service.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public HelloWorld helloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Welcome to this world!");
        return helloWorld;
    }
}

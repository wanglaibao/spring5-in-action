package com.laibao.spring5.javaconfigdemo.config;

import com.laibao.spring5.javaconfigdemo.service.HelloWorldThree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author laibao wang
 * @date 2018-01-02
 * @version 1.0
 */
@Configuration
public class AdditionalConfig {

    @Bean
    public HelloWorldThree helloWorldThree() {
        HelloWorldThree helloWorldThree = new HelloWorldThree();
        helloWorldThree.setMessage("苏联");
        return helloWorldThree;
    }
}

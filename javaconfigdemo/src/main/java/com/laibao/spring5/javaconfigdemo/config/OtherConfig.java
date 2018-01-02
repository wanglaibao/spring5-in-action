package com.laibao.spring5.javaconfigdemo.config;

import com.laibao.spring5.javaconfigdemo.service.HelloWorldTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author laibao wang
 * @date 2018-01-02
 * @version 1.0
 */
@Configuration
public class OtherConfig {

    @Bean
    public HelloWorldTwo helloWorldTwo() {
        HelloWorldTwo helloWorldTwo = new HelloWorldTwo();
        helloWorldTwo.setMessage("美国");
        return helloWorldTwo;
    }
}

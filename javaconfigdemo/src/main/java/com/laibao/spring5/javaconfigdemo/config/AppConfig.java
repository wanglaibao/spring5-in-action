package com.laibao.spring5.javaconfigdemo.config;

import com.laibao.spring5.javaconfigdemo.service.HelloWorldOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author laibao wang
 * @date 2018-01-02
 * @version 1.0
 */
@Configuration
public class AppConfig {

    @Bean
    public HelloWorldOne helloWorldOne() {
        HelloWorldOne helloWorldOne = new HelloWorldOne();
        helloWorldOne.setMessage("中国");
        return helloWorldOne;
    }
}

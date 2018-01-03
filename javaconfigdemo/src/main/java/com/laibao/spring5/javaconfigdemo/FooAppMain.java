package com.laibao.spring5.javaconfigdemo;

import com.laibao.spring5.javaconfigdemo.config.FooAppConfiguration;
import com.laibao.spring5.javaconfigdemo.service.FooService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author laibao wang
 * @date 2018-01-03
 * @version 1.0
 */
public class FooAppMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(FooAppConfiguration.class);
        applicationContext.refresh();
        FooService fooService = applicationContext.getBean(FooService.class);
        fooService.doSomething();
        applicationContext.close();
    }
}

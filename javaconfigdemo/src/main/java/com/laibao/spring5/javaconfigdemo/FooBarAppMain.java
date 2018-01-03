package com.laibao.spring5.javaconfigdemo;

import com.laibao.spring5.javaconfigdemo.config.FooBarAppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author laibao wang
 * @date 2018-01-03
 * @version 1.0
 */
public class FooBarAppMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(FooBarAppConfig.class);
        applicationContext.refresh();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        applicationContext.close();
    }
}

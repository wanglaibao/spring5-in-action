package com.laibao.spring5.javaconfigdemo;

import com.laibao.spring5.javaconfigdemo.config.ApplicationConfiguration;
import com.laibao.spring5.javaconfigdemo.service.HelloWorld;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author laibao wang
 * @date 2018-01-02
 * @version 1.0
 */
public class JavaConfigMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ApplicationConfiguration.class);
        applicationContext.refresh();
        HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
        helloWorld.getMessage();
        applicationContext.close();
    }
}

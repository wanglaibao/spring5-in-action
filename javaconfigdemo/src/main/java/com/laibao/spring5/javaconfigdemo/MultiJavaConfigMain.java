package com.laibao.spring5.javaconfigdemo;

import com.laibao.spring5.javaconfigdemo.config.AdditionalConfig;
import com.laibao.spring5.javaconfigdemo.config.AppConfig;
import com.laibao.spring5.javaconfigdemo.config.ApplicationConfiguration;
import com.laibao.spring5.javaconfigdemo.config.OtherConfig;
import com.laibao.spring5.javaconfigdemo.service.HelloWorld;
import com.laibao.spring5.javaconfigdemo.service.HelloWorldOne;
import com.laibao.spring5.javaconfigdemo.service.HelloWorldThree;
import com.laibao.spring5.javaconfigdemo.service.HelloWorldTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author laibao wang
 * @date 2018-01-02
 * @version 1.0
 */
public class MultiJavaConfigMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ApplicationConfiguration.class, AppConfig.class);
        applicationContext.register(OtherConfig.class, AdditionalConfig.class);
        applicationContext.refresh();

        HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
        helloWorld.getMessage();
        System.out.println();

        HelloWorldOne helloWorldOne = applicationContext.getBean(HelloWorldOne.class);
        helloWorldOne.getMessage();
        System.out.println();

        HelloWorldTwo helloWorldTwo = applicationContext.getBean(HelloWorldTwo.class);
        helloWorldTwo.getMessage();
        System.out.println();

        HelloWorldThree helloWorldThree = applicationContext.getBean(HelloWorldThree.class);
        helloWorldThree.getMessage();
        System.out.println();
    }
}

package com.laibao.spring5.javaconfigdemo.service;


import javax.annotation.PostConstruct;

/**
 * @author laibao wang
 * @date 2018-01-03
 * @version 1.0
 */
public class FooService {

    @PostConstruct
    public void init() {
        // custom initialization logic
        for(int i=0;i<10;i++){
            System.err.println("I am here, where are you?");
        }
    }

    public void doSomething() {
        System.err.println("I can do something, and you?");
    }
}

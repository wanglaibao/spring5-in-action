package com.laibao.spring5.javaconfigdemo.service;

/**
 * @author laibao wang
 * @date 2018-01-02
 * @version 1.0
 */
public class HelloWorldOne {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}

package com.laibao.spring5.commondesignpatterns.singleton;

/**
 * @author laibao wang
 * @date 2017-12-31
 * @version 1.0
 */
public class SingletonClass {

    private static SingletonClass instance = null;

    private SingletonClass() {}

    public static SingletonClass getInstance() {
        if (instance == null) {
            synchronized(SingletonClass.class){
                if (instance == null) {
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }

    public void otherMethod(){
        System.out.println("I am the other method of the class");
    }
}

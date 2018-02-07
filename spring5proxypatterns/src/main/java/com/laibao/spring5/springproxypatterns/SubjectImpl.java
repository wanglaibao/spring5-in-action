package com.laibao.spring5.springproxypatterns;

/**
 * @author laibao wang
 * @date 2018-01-05
 * @version 1.0
 */
public class SubjectImpl implements Subject {
    @Override
    public void test() {
        System.out.println("This is test method");
    }
}

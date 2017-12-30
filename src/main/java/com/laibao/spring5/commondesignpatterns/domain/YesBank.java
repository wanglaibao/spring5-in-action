package com.laibao.spring5.commondesignpatterns.domain;

/**
 * @author laibao wang
 * @date 2017-12-31
 * @version 1.0
 */
public class YesBank implements Bank{
    @Override
    public void bankName() {
        System.out.println("Yes Bank Pvt. Ltd.");
    }
}

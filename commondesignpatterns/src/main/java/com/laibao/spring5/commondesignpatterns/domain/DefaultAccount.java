package com.laibao.spring5.commondesignpatterns.domain;

/**
 * @author laibao wang
 * @date 2017-12-31
 * @version 1.0
 */
public class DefaultAccount implements Account{

    @Override
    public void accountType() {
        System.out.println("DEFAULT ACCOUNT");
    }
}

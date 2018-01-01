package com.laibao.spring5.commondesignpatterns.factory;

import com.laibao.spring5.commondesignpatterns.domain.Account;

/**
 * @author laibao wang
 * @date 2017-12-31
 * @version 1.0
 */
public class FactoryPatternMain {

    public static void main(String[] args) {
        AccountFactory accountFactory = new AccountFactory();

        //get an object of SavingAccount and call its accountType() method.
        Account savingAccount = accountFactory.getAccount("SAVING");
        //call accountType method of SavingAccount
        savingAccount.accountType();

        //get an object of CurrentAccount and call its accountType() method.
        Account currentAccount = accountFactory.getAccount("CURRENT");
        //call accountType method of CurrentAccount
        currentAccount.accountType();

        //get an object of DefaultAccount and call its accountType() method.
        Account defaultAccount = accountFactory.getAccount("OTHER");
        //call accountType method of defaultAccount
        defaultAccount.accountType();
    }
}

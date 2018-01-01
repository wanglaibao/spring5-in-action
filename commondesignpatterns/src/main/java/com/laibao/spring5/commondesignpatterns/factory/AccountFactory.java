package com.laibao.spring5.commondesignpatterns.factory;

import com.laibao.spring5.commondesignpatterns.domain.Account;
import com.laibao.spring5.commondesignpatterns.domain.CurrentAccount;
import com.laibao.spring5.commondesignpatterns.domain.DefaultAccount;
import com.laibao.spring5.commondesignpatterns.domain.SavingAccount;
import org.apache.commons.lang3.StringUtils;

/**
 * @author laibao wang
 * @date 2017-12-31
 * @version 1.0
 */
public class AccountFactory {

    final String CURRENT_ACCOUNT = "CURRENT";

    final String SAVING_ACCOUNT  = "SAVING";

    //use getAccount method to get object of type Account
    //It is factory method for object of type Account
    public Account getAccount(String accountType){
        if (StringUtils.isBlank(accountType)){
            throw new IllegalArgumentException("accountType can not be empty!");
        }
        if(CURRENT_ACCOUNT.equals(accountType)) {
            return new CurrentAccount();
        }else if(SAVING_ACCOUNT.equals(accountType)){
            return new SavingAccount();
        }
        return new DefaultAccount();
    }
}

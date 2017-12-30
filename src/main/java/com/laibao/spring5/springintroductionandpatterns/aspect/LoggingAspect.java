package com.laibao.spring5.springintroductionandpatterns.aspect;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author laibao wang
 * @date 2017-12-30
 * @version .0
 */

@Aspect
public class LoggingAspect {

    private static final String beforeTransferPoint = "execution(* com.laibao.spring5.springintroductionandpatterns.service.impl.TransferServiceImpl.transfer*(..))";

    private static final String afterTransferPoint = "execution(* com.laibao.spring5.springintroductionandpatterns.service.impl.TransferServiceImpl.transfer*(..))";

    @Before(beforeTransferPoint)
    public void logBeforeTransfer(){
        System.out.println("####LoggingAspect.logBeforeTransfer() method called before transfer amount####");
    }

    @After(afterTransferPoint)
    public void logAfterTransfer(){
        System.out.println("####LoggingAspect.logAfterTransfer() method called after transfer amount####");
    }
}

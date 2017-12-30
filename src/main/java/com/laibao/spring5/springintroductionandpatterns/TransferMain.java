package com.laibao.spring5.springintroductionandpatterns;

import com.laibao.spring5.springintroductionandpatterns.config.ApplicationConfiguration;
import com.laibao.spring5.springintroductionandpatterns.service.TransferService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author laibao wang
 * @date 2017-12-30
 * @version 1.0
 */
public class TransferMain {

    public static void main(String[] args) {
        //Load Spring context
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        //Get TransferService bean
        TransferService transferService = applicationContext.getBean(TransferService.class);
        //Use transfer method
        transferService.transferAmount(100l, 200l, 2000.00);
        applicationContext.close();
    }
}

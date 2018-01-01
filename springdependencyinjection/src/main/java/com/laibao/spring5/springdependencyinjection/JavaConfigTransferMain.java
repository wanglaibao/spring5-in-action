package com.laibao.spring5.springdependencyinjection;

import com.laibao.spring5.springdependencyinjection.config.ApplicationConfiguration;
import com.laibao.spring5.springdependencyinjection.service.TransferService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author laibao wang
 * @date 2018-01-01
 * @version 1.0
 */
public class JavaConfigTransferMain {

    public static void main(String[] args) {
        //Load Spring context
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        //Get TransferService bean
        TransferService transferService = applicationContext.getBean("annotationTransferService",TransferService.class);
        //Use transfer method
        transferService.transferAmount(100l, 200l, 3000.00);
        applicationContext.close();
    }
}

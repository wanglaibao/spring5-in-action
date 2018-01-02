package com.laibao.spring5.springfactorybean;

import com.laibao.spring5.springfactorybean.config.ApplicationConfiguration;
import com.laibao.spring5.springfactorybean.service.TransferService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author laibao wang
 * @date 2018-01-02
 * @version 1.0
 */
public class JavaConfigFactoryBeanTransferMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        //Get TransferService bean
        TransferService transferService = applicationContext.getBean("annotationTransferService",TransferService.class);
        //Use transfer method
        transferService.transferAmount(100l, 200l, 199000.00);
        applicationContext.close();
    }
}

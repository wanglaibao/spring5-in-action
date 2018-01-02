package com.laibao.spring5.springfactorybean;

import com.laibao.spring5.springfactorybean.service.TransferService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author laibao wang
 * @date 2018-01-02
 * @version 1.0
 */
public class XmlFactoryBeanTransferMain {

    public static void main(String[] args) {
        //Load Spring context
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");
        //Get TransferService bean
        TransferService transferService = applicationContext.getBean("transferService",TransferService.class);
        //Use transfer method
        transferService.transferAmount(100l, 200l, 99000.00);
        applicationContext.close();
    }
}

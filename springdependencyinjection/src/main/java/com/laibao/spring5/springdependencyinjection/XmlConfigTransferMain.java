package com.laibao.spring5.springdependencyinjection;

import com.laibao.spring5.springdependencyinjection.service.TransferService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author laibao wang
 * @date 2018-01-01
 * @version 1.0
 */
public class XmlConfigTransferMain {

    public static void main(String[] args) {
        //Load Spring context
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");
        //Get TransferService bean
        TransferService transferService = applicationContext.getBean(TransferService.class);
        //Use transfer method
        transferService.transferAmount(100l, 200l, 3000.00);
        applicationContext.close();
    }
}

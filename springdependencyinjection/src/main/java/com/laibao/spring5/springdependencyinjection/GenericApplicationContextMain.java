package com.laibao.spring5.springdependencyinjection;

import com.laibao.spring5.springdependencyinjection.service.TransferService;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author laibao wang
 * @date 2018-01-02
 * @version 1.0
 */
public class GenericApplicationContextMain {

    public static void main(String[] args) {
        GenericApplicationContext genericApplicationContext = new GenericApplicationContext();
        new XmlBeanDefinitionReader(genericApplicationContext).loadBeanDefinitions("META-INF/spring/applicationContext.xml");
        genericApplicationContext.refresh();  // this method must be called
        //Get TransferService bean
        TransferService transferService = genericApplicationContext.getBean(TransferService.class);
        //Use transfer method
        transferService.transferAmount(100l, 200l, 3000.00);
        genericApplicationContext.close();
    }
}

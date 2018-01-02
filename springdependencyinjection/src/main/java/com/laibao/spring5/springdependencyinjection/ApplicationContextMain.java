package com.laibao.spring5.springdependencyinjection;

import com.alibaba.fastjson.JSON;
import com.laibao.spring5.springdependencyinjection.service.TransferService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author laibao wang
 * @version 1.0
 * @date 2018-01-02
 */
public class ApplicationContextMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/spring/services.xml", "META-INF/spring/repository.xml");
        if (applicationContext != null) {
            System.out.println("Hello World");
            System.out.println(JSON.toJSONString(applicationContext));
        }
        applicationContext.close();


        ClassPathXmlApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");
        if (applicationContext1 != null) {
            System.out.println("Bye Bye");
            System.out.println(JSON.toJSONString(applicationContext1));
        }

        //Get TransferService bean
        TransferService transferService = applicationContext1.getBean(TransferService.class);
        //Use transfer method
        transferService.transferAmount(100l, 200l, 3000.00);
        applicationContext1.close();
    }
}

package com.laibao.spring5.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author laibao wang
 * @date 2017-12-30
 * @version 1.0
 */
public class BeanConfigurationApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        MessageSetterPrinter messageSetterPrinter = applicationContext.getBean(MessageSetterPrinter.class);
        messageSetterPrinter.printMessage();
    }
}

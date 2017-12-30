package com.laibao.spring5.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author laibao wang
 * @date 2017-12-30
 * @version 1.0
 */
@Component
public class MessageSetterPrinter {

    @Autowired
    private MessageService messageService;

    public void printMessage() {
        System.out.println(this.messageService.getMessage());
    }
}

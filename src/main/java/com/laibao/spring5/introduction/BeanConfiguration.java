package com.laibao.spring5.introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author laibao wang
 * @date 2017-12-30
 * @version 1.0
 */
@Configuration
@ComponentScan
public class BeanConfiguration {

    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
                return "Hello World!\n This is the simple bean configuration Spring Hello World Example";
            }
        };
    }
}

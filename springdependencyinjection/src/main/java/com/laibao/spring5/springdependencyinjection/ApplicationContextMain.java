package com.laibao.spring5.springdependencyinjection;

import com.alibaba.fastjson.JSON;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author laibao wang
 * @date 2018-01-02
 * @version 1.0
 */
public class ApplicationContextMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/spring/services.xml", "META-INF/spring/repository.xml");
        if (applicationContext != null){
            System.out.println(JSON.toJSONString(applicationContext));
        }
        applicationContext.close();
    }
}

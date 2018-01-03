package com.laibao.spring5.javaconfigdemo;

import com.laibao.spring5.javaconfigdemo.config.TextEditorConfig;
import com.laibao.spring5.javaconfigdemo.service.TextEditor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author laibao wang
 * @date 2018-01-02
 * @version 1.0
 */
public class TextEditorAppMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(TextEditorConfig.class);
        applicationContext.refresh();

        TextEditor textEditor = applicationContext.getBean(TextEditor.class);
        textEditor.spellCheck();

    }
}

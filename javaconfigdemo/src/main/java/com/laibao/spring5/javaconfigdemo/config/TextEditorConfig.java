package com.laibao.spring5.javaconfigdemo.config;

import com.laibao.spring5.javaconfigdemo.service.SpellChecker;
import com.laibao.spring5.javaconfigdemo.service.TextEditor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author laibao wang
 * @date 2018-01-02
 * @version
 */
@Configuration
public class TextEditorConfig {

    @Bean
    public SpellChecker spellChecker() {
        return new SpellChecker();
    }

    @Bean
    public TextEditor textEditor() {
        return new TextEditor(spellChecker());
    }
}

package com.laibao.spring5.javaconfigdemo.service;

/**
 * @author laibao wang
 * @date 2018-01-02
 * @version 1.0
 */
public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker){
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}

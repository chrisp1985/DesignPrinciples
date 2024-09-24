package com.chrisp1985.gof.chainofresponsibility;

public class TextEditor extends FileEditor {
    @Override
    protected void write(String message) {
        System.out.println(message + " Opening generic text file.");
    }
}

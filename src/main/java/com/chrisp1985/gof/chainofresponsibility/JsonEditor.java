package com.chrisp1985.gof.chainofresponsibility;

public class JsonEditor extends FileEditor {
    @Override
    protected void write(String message) {
        System.out.println(message + " Opening JSON file.");
    }
}

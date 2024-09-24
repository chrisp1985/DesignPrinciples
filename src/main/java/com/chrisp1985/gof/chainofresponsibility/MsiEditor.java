package com.chrisp1985.gof.chainofresponsibility;

public class MsiEditor extends FileEditor {
    @Override
    protected void write(String message) {
        System.out.println(message + " Opening MSI file.");
    }
}

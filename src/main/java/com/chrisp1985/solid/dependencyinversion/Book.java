package com.chrisp1985.solid.dependencyinversion;

public class Book implements BookInterface {
    @Override
    public void readBook() {
        System.out.println("Reading a book.");
    }
}

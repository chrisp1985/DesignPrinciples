package com.chrisp1985.gof.facade;

public class HardbackBook implements Book {
    String name;

    public HardbackBook(String bookName) {
        this.name = bookName;
    }

    @Override
    public void read() {
        System.out.println("Reading the hardback book.");
    }

    @Override
    public String getName() {
        return this.name;
    }
}

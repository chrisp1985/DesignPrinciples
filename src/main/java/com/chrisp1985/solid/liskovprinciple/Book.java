package com.chrisp1985.solid.liskovprinciple;

public class Book {

    /**
     * EXPLANATION
     *
     * This class can store all of the logic of the books and doesn't need them to depend on inheritance or overriding.
     * Favours composition over inheritance.
     *
     */

    public void readPages() {
        System.out.println("Reading the book.");
    }

    public void removeSleeve() {
        System.out.println("Removing sleeve of the book.");
    }

    public void addSleeve() {
        System.out.println("Adding sleeve onto the book.");
    }
}

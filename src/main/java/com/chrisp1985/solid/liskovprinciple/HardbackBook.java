package com.chrisp1985.solid.liskovprinciple;

public class HardbackBook {

    Book book;
    Boolean sleeveOn;

    public HardbackBook() {
        sleeveOn = true;
    }

    public void readPages() {
        book.readPages();
    }

    public void removeSleeve() {
        book.removeSleeve();
        sleeveOn = false;
    }

    public void addSleeve() {
        book.addSleeve();
        sleeveOn = true;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}

package com.chrisp1985.solid.liskovprinciple;

public class PaperbackBook {
    Book book;

    public void readPages() {
        book.readPages();
    }

    public void setBook(Book book) {
        this.book = book;
    }
}

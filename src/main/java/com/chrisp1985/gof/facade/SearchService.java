package com.chrisp1985.gof.facade;

public class SearchService {

    public void searchForBook(Book book) {
        System.out.printf("Searched for, and found, %s.\n", book.getName());
    }
}

package com.chrisp1985.gof.facade;

public class AudioConversionService {

    public void convertBook(Book book) {
        System.out.printf("Converting %s.\n", book.getName());
    }
}

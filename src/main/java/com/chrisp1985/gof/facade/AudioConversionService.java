package com.chrisp1985.gof.facade;

public class AudioConversionService {

    public void convertBook(FacadeBook book) {
        System.out.printf("Converting %s.\n", book.getName());
    }
}

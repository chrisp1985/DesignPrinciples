package com.chrisp1985.gof.facade;

public class LibraryFacade {

    ReservationService reservationService;
    AudioConversionService audioConversionService;
    SearchService searchService;

    public LibraryFacade() {
        this.reservationService = new ReservationService();
        this.audioConversionService = new AudioConversionService();
        this.searchService = new SearchService();
        System.out.println("Entering the library.");
    }

    public void searchForBook(Book book) {
        this.searchService.searchForBook(book);
    }

    public void reserveBook(Book book) {
        this.reservationService.reserveBook(book);
    }

    public void convertBook(Book book) {
        this.audioConversionService.convertBook(book);
    }
}

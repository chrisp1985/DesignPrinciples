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

    public void searchForBook(FacadeBook book) {
        this.searchService.searchForBook(book);
    }

    public void reserveBook(FacadeBook book) {
        this.reservationService.reserveBook(book);
    }

    public void convertBook(FacadeBook book) {
        this.audioConversionService.convertBook(book);
    }
}

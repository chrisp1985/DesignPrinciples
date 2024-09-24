package com.chrisp1985.gof.facade;

public class ReservationService {

    public void reserveBook(FacadeBook book) {
        System.out.printf("Reserving %s.\n", book.getName());
    }

    public void getAvailableBooksFromDb() {
        System.out.println("Pulling book data from Db.");
    }

    public void sendNotificationsForExpiredReservations() {
        System.out.println("Sending messages to poeple who have had books for too long.");
    }
}

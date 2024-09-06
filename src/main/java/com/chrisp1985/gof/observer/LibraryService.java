package com.chrisp1985.gof.observer;

public class LibraryService {

    private final NotificationService notificationService;

    public LibraryService() {
        this.notificationService = new NotificationService();
    }

    public void subscribeToNotification(EmailListener emailListener) {
        this.notificationService.subscribe(emailListener);
    }

    public void unsubscribeFromNotification(EmailListener emailListener) {
        this.notificationService.unsubscribe(emailListener);
    }

    private void notifyAboutEvent(String title) {
        this.notificationService.notify(String.format("Book added to Library: %s", title));
    }

    public void bookReturned(SmallBook smallBook) {
        System.out.println("Book returned to Library.");
        System.out.println("Book details amended in database.");
        System.out.println("Notification sent to interested parties.");
        notifyAboutEvent(smallBook.title);
    }
}

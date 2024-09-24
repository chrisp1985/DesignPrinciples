package com.chrisp1985.gof.observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private List<EmailListener> listenerList;

    public NotificationService() {
        listenerList = new ArrayList<>();
    }

    public void subscribe(EmailListener listener) {
        listenerList.add(listener);
        System.out.printf("New member added: %s\n", listener.emailAddress());
    }

    public void unsubscribe(EmailListener listener) {
        listenerList.remove(listener);
        System.out.printf("Member unsubscribed: %s\n", listener.emailAddress());
    }

    public void notify(String message) {
        listenerList.forEach(EmailListener::update);
    }
}

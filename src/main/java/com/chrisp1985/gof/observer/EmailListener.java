package com.chrisp1985.gof.observer;

import lombok.Getter;

@Getter
public class EmailListener implements ListenerInterface{

    private final String emailAddress;

    public EmailListener(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void update() {
        System.out.printf("Sending email to listener at %s. A book you wanted has been returned. Check the library.\n\n",
                this.emailAddress);
    }

}

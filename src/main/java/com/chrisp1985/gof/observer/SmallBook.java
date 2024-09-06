package com.chrisp1985.gof.observer;

import lombok.Data;

@Data
public class SmallBook {

    String title;
    String author;

    public SmallBook(String title,
                     String author) {
        this.title = title;
        this.author = author;
    }
}

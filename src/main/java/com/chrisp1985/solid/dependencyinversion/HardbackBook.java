package com.chrisp1985.solid.dependencyinversion;

public class HardbackBook {

    /**
     * EXPLANATION
     *
     * We're passing in the interface into Hardback book rather than 'Book' itself, as 'Book' might change, or we might
     * want to pass in a different variant of 'Book' at a later date. By relying on the interface in our dependency injection,
     * we're abstracting away from relying on the concrete class and allowing for further flexibility down the line.
     *
     */

    BookInterface bookInterface;

    public HardbackBook(BookInterface bookInterface) {
        this.bookInterface = bookInterface;
    }

    public void readBook() {
        this.bookInterface.readBook();
    }
}

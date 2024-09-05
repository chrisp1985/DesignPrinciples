package com.chrisp1985.gof.builder;

public class BookBuilder {

    String title;
    Long ISBN;
    Genre genre;
    Boolean isNew;
    String author;

    public BookBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder setISBN(Long ISBN) {
        this.ISBN = ISBN;
        return this;
    }

    public BookBuilder setGenre(Genre genre) {
        this.genre = genre;
        return this;
    }

    public BookBuilder setisNew(Boolean isNew) {
        this.isNew = isNew;
        return this;
    }

    public BookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public Book build() {
        return new Book(this.title, this.author, this.ISBN, this.genre, this.isNew);
    }
}

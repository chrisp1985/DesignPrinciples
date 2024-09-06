package com.chrisp1985.gof.builder;

public class Book {

    String title;
    String author;
    Long ISBN;
    Genre genre;
    Boolean isNew;

    public Book(BookBuilder bookBuilder) {
        this.title = bookBuilder.title;
        this.ISBN = bookBuilder.ISBN;
        this.genre = bookBuilder.genre;
        this.isNew = bookBuilder.isNew;
        this.author = bookBuilder.author;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public Genre getGenre() {
        return genre;
    }

    public Long getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Book getBook() {
        return this;
    }

    public static BookBuilder getBuilder() {
        return new BookBuilder();
    }
}


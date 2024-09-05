package com.chrisp1985.gof.builder;

public class Book {

    String title;
    String author;
    Long ISBN;
    Genre genre;
    Boolean isNew;

    public Book(String title,
                String author,
                Long ISBN,
                Genre genre,
                Boolean isNew) {
        this.title = title;
        this.ISBN = ISBN;
        this.genre = genre;
        this.isNew = isNew;
        this.author = author;
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
}


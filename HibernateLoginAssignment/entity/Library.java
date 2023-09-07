package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Library {
    String title;
    String author;
    String isbn;
    int pubyear;

    public Library() {
    }

    public Library(String title, String author, String isbn, int pubyear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pubyear = pubyear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPubyear() {
        return pubyear;
    }

    public void setPubyear(int pubyear) {
        this.pubyear = pubyear;
    }
    @Id
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Library{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pubyear=" + pubyear +
                ", isbn=" + isbn +
                '}';
    }
}

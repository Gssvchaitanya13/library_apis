package com.ssvlearning.library.model;


import java.time.LocalDate;
import java.util.Date;

public class Book {

    private int id;

    private String title;

    private  String authorName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    private String genre;



    private LocalDate publishedDate;

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public Book() {
    }

    public Book(int id, String title, String authorName, String genre, LocalDate publishedDate) {
        this.id = id;
        this.title = title;
        this.authorName = authorName;
        this.genre = genre;
        this.publishedDate = publishedDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }




}

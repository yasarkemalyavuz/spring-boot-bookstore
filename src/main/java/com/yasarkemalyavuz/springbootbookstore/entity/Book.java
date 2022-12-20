package com.yasarkemalyavuz.springbootbookstore.entity;

public class Book {

    private int book_id;

    private String book_name;

    private String book_author;

    private int total_page;

    private int publish_year;


    public Book(int book_id, String book_name, String book_author, int total_page, int publish_year) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_author = book_author;
        this.total_page = total_page;
        this.publish_year = publish_year;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public int getTotal_page() {
        return total_page;
    }

    public void setTotal_page(int total_page) {
        this.total_page = total_page;
    }

    public int getPublish_year() {
        return publish_year;
    }

    public void setPublish_year(int publish_year) {
        this.publish_year = publish_year;
    }
}

package ru.alishev.springcourse.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
    private int book_id;
    private int person_id;


    @NotEmpty(message = "Name of the book should not be empty")
    @Size(min = 2, max = 100, message = "Name of the book should be between 2 and 30 characters")
    private String book_name;
    @Size(min = 2, max = 100, message = "Name of the book should be between 2 and 30 characters")
    @NotEmpty(message = "Field of Author should not be empty")
    private String author;

    @Min(value = 1500, message = "Year should be greater than 1500")
    private int year;

    public Book() {

    }

    public Book(String book_name, String author, int year) {
        this.book_name = book_name;
        this.author = author;
        this.year = year;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

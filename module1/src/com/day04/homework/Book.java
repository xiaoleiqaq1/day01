package com.day04.homework;

public class Book {
    private int number;
    private String name;
    private int isbn;
    private double price;
    private int year;
    private int month;
    private int day;

    public Book() {
    }

    public Book(int number, String name, int isbn, double price, int year, int month, int day) {
        this.number = number;
        this.name = name;
        this.isbn = isbn;
        this.price = price;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

}

package org.example;
// Question 2 done

import java.util.Arrays;

public class Book {
    private String ISBN;
    private String name;
    private Author[] authors;
    private String publisher;
    private double price;

    public Book(String ISBN, String name, Author[] authors,
                String publisher, double price) {
        this.ISBN = ISBN;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String display() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o instanceof Book) {
            Book b = (Book) o;
            return this.ISBN.equals(b.ISBN);
        }

        return false;
    }

    @Override
    public String toString() {
        return display();
    }
}
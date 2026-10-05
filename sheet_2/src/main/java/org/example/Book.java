package org.example;

public class Book {
    private String ISBN;
    private String name;
    private Author author;
    private String publisher;
    private double price;

    public Book(String ISBN, String name, Author author, String publisher, double price) {
        this.ISBN = ISBN;
        this.name = name;
        this.author = author;
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    public String display(){
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", name='" + name + '\'' +
                ", author=" + author.display() +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o instanceof Book){
            Book b = (Book)o;
            return this.ISBN.equals(b.ISBN);
        }
        else return false;
    }
    @Override
    public String toString() {
        return display();
    }

}

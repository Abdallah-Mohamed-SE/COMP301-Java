package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    // Question 3
    System.out.println("enter author name");
    String authorName = in.next();
    System.out.println("enter author email");
    String authorEmail = in.next();
    System.out.println("enter ISBN of book");
    String bookISBN = in.next();
    System.out.println("enter name of book");
    String bookName = in.next();
    System.out.println("enter name of Publisher");
    String bookPublisher = in.nextLine();
    System.out.println("enter price of book");
    double bookPrice = in.nextInt();

    Author author = new Author(authorName,authorEmail);
    Book book = new Book(bookISBN,bookName,author,bookPublisher,bookPrice);

    System.out.println(book);



    }
}
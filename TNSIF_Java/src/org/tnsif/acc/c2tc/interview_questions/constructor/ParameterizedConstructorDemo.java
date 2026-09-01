package org.tnsif.acc.c2tc.interview_questions.constructor;

class Book {
    String title;
    String author;

    // Parameterized constructor
    Book(String t, String a) {
        title = t;
        author = a;
    }

    void displayDetails() {
        System.out.println("Book: " + title + " by " + author);
    }
}

public class ParameterizedConstructorDemo {
    public static void main(String[] args) {
        Book myBook = new Book("1984", "George Orwell");
        myBook.displayDetails();
    }
}
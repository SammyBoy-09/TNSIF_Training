package org.tnsif.acc.c2tc.interview_questions.this_instanceof_polymorphism;

class Rectangle {
    int width, height;

    // Default constructor
    Rectangle() {
        this(10, 5); // Calls the parameterized constructor
        System.out.println("Default constructor finished.");
    }

    // Parameterized constructor
    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        System.out.println("Rectangle created: " + width + "x" + height);
    }
}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(); 
    }
}
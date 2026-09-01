package org.tnsif.acc.c2tc.interview_questions.constructor;

class Car {
    String color;

    // Explicit default constructor
    Car() {
        color = "White";
        System.out.println("Default constructor called. Car color set to " + color);
    }
}

public class DefaultConstructorDemo {
    public static void main(String[] args) {
        Car myCar = new Car(); 
    }
}

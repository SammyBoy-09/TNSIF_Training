package org.tnsif.acc.c2tc.interview_questions.interfacedemo;

interface Vehicle {
    void drive();
    
    // Default method provides a built-in implementation
    default void honk() {
        System.out.println("Beep beep!");
    }
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving on the road.");
    }
}

public class DefaultMethodDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
        myCar.honk(); // Calls the interface's default method
    }
}
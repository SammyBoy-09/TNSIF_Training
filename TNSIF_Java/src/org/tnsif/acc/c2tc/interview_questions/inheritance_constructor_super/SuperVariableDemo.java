package org.tnsif.acc.c2tc.interview_questions.inheritance_constructor_super;

class Vehicle {
    int maxSpeed = 120; // Parent variable
}

class Car extends Vehicle {
    int maxSpeed = 180; // Child variable hides parent variable

    void displaySpeeds() {
        System.out.println("Car max speed: " + maxSpeed);
        System.out.println("Vehicle max speed: " + super.maxSpeed); // Accesses parent variable
    }
}

public class SuperVariableDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.displaySpeeds();
    }
}
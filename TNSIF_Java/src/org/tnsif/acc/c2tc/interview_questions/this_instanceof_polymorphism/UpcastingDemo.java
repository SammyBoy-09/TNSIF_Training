package org.tnsif.acc.c2tc.interview_questions.this_instanceof_polymorphism;

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving.");
    }
}

class Bike extends Vehicle {
    @Override
    void move() {
        System.out.println("Bike is pedaling forward.");
    }
}

public class UpcastingDemo {
    public static void main(String[] args) {
        // Upcasting: Bike object assigned to Vehicle reference
        Vehicle myVehicle = new Bike(); 
        
        // Polymorphism in action
        myVehicle.move(); 
    }
}
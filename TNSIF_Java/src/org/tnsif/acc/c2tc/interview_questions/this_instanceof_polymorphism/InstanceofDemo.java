package org.tnsif.acc.c2tc.interview_questions.this_instanceof_polymorphism;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class InstanceofDemo {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();

        System.out.println("Is myAnimal a Dog? " + (myAnimal instanceof Dog)); // true
        System.out.println("Is myAnimal an Animal? " + (myAnimal instanceof Animal)); // true
        System.out.println("Is myAnimal a Cat? " + (myAnimal instanceof Cat)); // false
    }
}
package org.tnsif.acc.c2tc.interview_questions.inheritance;

class Parent {
    void greet() {
        System.out.println("Hello from the Parent class!");
    }
}

class Child extends Parent {
    void greetParent() {
        // Using 'super' to call the parent's method
        super.greet(); 
        System.out.println("Hello from the Child class!");
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.greetParent();
    }
}
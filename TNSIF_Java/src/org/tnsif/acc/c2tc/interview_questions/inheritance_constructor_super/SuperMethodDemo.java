package org.tnsif.acc.c2tc.interview_questions.inheritance_constructor_super;

class Base {
    Base() {
        System.out.println("Base class initialized.");
    }
}

class Derived extends Base {
    Derived() {
        super(); // Explicitly calling the parent constructor
        System.out.println("Derived class initialized.");
    }
}

public class SuperMethodDemo {
    public static void main(String[] args) {
        Derived d = new Derived();
    }
}
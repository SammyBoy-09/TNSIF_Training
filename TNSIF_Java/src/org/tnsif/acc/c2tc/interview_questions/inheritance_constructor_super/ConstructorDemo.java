package org.tnsif.acc.c2tc.interview_questions.inheritance_constructor_super;

class Parent {
    Parent() {
        System.out.println("Parent constructor called.");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor called.");
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Child obj = new Child(); 
    }
}
package org.tnsif.acc.c2tc.interview_questions.interfacedemo;

interface Flyable { 
    void fly(); 
}

interface Swimmable { 
    void swim(); 
}

class Duck implements Flyable, Swimmable {
    @Override
    public void fly() { 
        System.out.println("Duck is flying."); 
    }
    
    @Override
    public void swim() { 
        System.out.println("Duck is swimming."); 
    }
}

public class MultipleInterfacesDemo {
    public static void main(String[] args) {
        Duck mallard = new Duck();
        mallard.fly();
        mallard.swim();
    }
}
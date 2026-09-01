package org.tnsif.acc.c2tc.interview_questions.inheritance;

class Bird {
    void fly() {
        System.out.println("Bird is flying high in the sky.");
    }
}

class Penguin extends Bird {
    // Overriding the fly method because penguins don't fly
    @Override
    void fly() {
        System.out.println("Penguins cannot fly, but they can swim!");
    }
}

public class OverridingInheritanceDemo {
    public static void main(String[] args) {
        Bird normalBird = new Bird();
        normalBird.fly();
        
        Penguin myPenguin = new Penguin();
        myPenguin.fly(); // Calls the overridden method in Penguin
    }
}
package org.tnsif.acc.c2tc.interview_questions.constructor;

class User {
    String username;
    int age;

    User(String username, int age) {
        this.username = username;
        this.age = age;
    }
}

public class ObjectInitializationDemo {
    public static void main(String[] args) {
        // Creating the object and initializing values simultaneously
        User user1 = new User("Alice_Dev", 28);
        
        System.out.println("Username: " + user1.username);
        System.out.println("Age: " + user1.age);
    }
}

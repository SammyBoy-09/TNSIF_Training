package org.tnsif.acc.c2tc.interview_questions.this_instanceof_polymorphism;

class Student {
    String name; // Instance variable

    Student(String name) {
        // 'this.name' is the instance variable, 'name' is the local parameter
        this.name = name; 
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Student s = new Student("Bob");
        s.display();
    }
}
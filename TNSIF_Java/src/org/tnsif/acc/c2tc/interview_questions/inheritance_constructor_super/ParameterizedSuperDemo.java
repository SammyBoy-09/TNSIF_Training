package org.tnsif.acc.c2tc.interview_questions.inheritance_constructor_super;

class Person {
    String name;

    // Parameterized constructor
    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    int grade;

    Student(String name, int grade) {
        super(name); // Must be the first line to fulfill Person's constructor
        this.grade = grade;
    }

    void display() {
        System.out.println("Name: " + name + ", Grade: " + grade);
    }
}

public class ParameterizedSuperDemo {
    public static void main(String[] args) {
        Student student = new Student("Alice", 9);
        student.display();
    }
}

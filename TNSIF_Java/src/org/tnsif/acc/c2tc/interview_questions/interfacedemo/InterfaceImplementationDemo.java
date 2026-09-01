package org.tnsif.acc.c2tc.interview_questions.interfacedemo;

interface Printable {
    void print();
}

class Document implements Printable {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }
}

public class InterfaceImplementationDemo {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
    }
}
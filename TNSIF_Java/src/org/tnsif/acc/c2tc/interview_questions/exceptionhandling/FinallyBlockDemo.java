package org.tnsif.acc.c2tc.interview_questions.exceptionhandling;

public class FinallyBlockDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block. Opening resource...");
            int data = 25 / 0; // Triggers an exception
            System.out.println("This line will be skipped.");
        } catch (ArithmeticException e) {
            System.out.println("Inside catch block: Handled division by zero.");
        } finally {
            // This block ALWAYS executes, whether an exception occurred or not
            System.out.println("Inside finally block. Closing resources...");
        }
    }
}
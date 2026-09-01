package org.tnsif.acc.c2tc.interview_questions.exceptionhandling;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        
        try {
            // This will trigger an ArithmeticException
            int result = numerator / denominator; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide a number by zero.");
        }
    }
}
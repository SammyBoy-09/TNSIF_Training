package org.tnsif.acc.c2tc.interview_questions.exceptionhandling;

public class TryCatchDemo {
    public static void main(String[] args) {
    	
        try {
            int[] numbers = {1, 2, 3};
            // Attempting to access an index that doesn't exist
            System.out.println(numbers[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }
        
        System.out.println("Program continues executing normally after the try-catch block.");
    }
}
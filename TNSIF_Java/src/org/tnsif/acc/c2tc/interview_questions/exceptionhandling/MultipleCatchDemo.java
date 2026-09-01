package org.tnsif.acc.c2tc.interview_questions.exceptionhandling;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            String[] data = {"10", "0", "A"};
            int num1 = Integer.parseInt(data[0]);
            int num2 = Integer.parseInt(data[1]);
            
            // May cause ArithmeticException
            int result = num1 / num2; 
            
            // May cause ArrayIndexOutOfBoundsException if index is too high
            System.out.println(data[5]); 
            
        } catch (ArithmeticException e) {
            System.out.println("Math Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error: Tried to access an invalid index.");
        } catch (NumberFormatException e) {
            System.out.println("Format Error: Invalid number format encountered.");
        } catch (Exception e) {
            // General exception catch-all (must be placed last)
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
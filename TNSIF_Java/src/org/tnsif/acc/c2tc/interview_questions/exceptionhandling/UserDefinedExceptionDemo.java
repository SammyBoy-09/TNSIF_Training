package org.tnsif.acc.c2tc.interview_questions.exceptionhandling;

//Defining a custom exception by extending the Exception class
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class UserDefinedExceptionDemo {
 // Method that can throw the custom exception
 static void checkVotingEligibility(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Age must be 18 or older to vote.");
     } else {
         System.out.println("Eligible to vote.");
     }
 }

 public static void main(String[] args) {
     try {
         checkVotingEligibility(16);
     } catch (InvalidAgeException e) {
         System.out.println("Exception Caught: " + e.getMessage());
     }
 }
}

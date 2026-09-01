package org.tnsif.acc.c2tc.interview_questions.exceptionhandling;

public class ThrowKeywordDemo {
    static void validateTemperature(int temperature) {
        if (temperature > 100) {
            // Explicitly throwing an instance of an exception
            throw new IllegalArgumentException("Temperature exceeds maximum safe limit!");
        }
        System.out.println("Temperature is within safe limits: " + temperature);
    }

    public static void main(String[] args) {
        try {
            validateTemperature(105);
        } catch (IllegalArgumentException e) {
            System.out.println("Alert: " + e.getMessage());
        }
    }
}

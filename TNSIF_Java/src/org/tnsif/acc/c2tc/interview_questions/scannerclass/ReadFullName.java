package org.tnsif.acc.c2tc.interview_questions.scannerclass;

import java.util.Scanner;

public class ReadFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        // nextLine() reads the entire line until the user presses Enter
        String fullName = scanner.nextLine(); 

        System.out.println("Welcome, " + fullName + "!");
        
        scanner.close();
    }
}
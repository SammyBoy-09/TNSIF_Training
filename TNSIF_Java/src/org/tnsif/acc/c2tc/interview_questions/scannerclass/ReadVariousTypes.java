package org.tnsif.acc.c2tc.interview_questions.scannerclass;

import java.util.Scanner;

public class ReadVariousTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int age = scanner.nextInt();

        System.out.print("Enter a double: ");
        double height = scanner.nextDouble();

        // Consume the leftover newline character
        scanner.nextLine(); 

        System.out.print("Enter a single word (String): ");
        String word = scanner.nextLine();

        System.out.println("\nYou entered - Age: " + age + ", Height: " + height + ", Word: " + word);
        scanner.close();
    }
}

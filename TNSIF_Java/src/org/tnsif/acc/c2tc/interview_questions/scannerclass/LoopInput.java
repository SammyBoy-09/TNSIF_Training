package org.tnsif.acc.c2tc.interview_questions.scannerclass;

import java.util.Scanner;

public class LoopInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        System.out.println("Type your words. Type 'exit' to stop.");

        // Loop runs until the user types "exit" (ignoring case)
        while (true) {
            System.out.print("> ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting loop...");
                break;
            }

            System.out.println("You typed: " + input);
        }
        
        scanner.close();
    }
}
package org.tnsif.acc.c2tc.interview_questions.scannerclass;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("You entered: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}
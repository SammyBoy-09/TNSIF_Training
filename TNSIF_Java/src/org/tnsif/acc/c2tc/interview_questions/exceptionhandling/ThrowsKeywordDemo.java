package org.tnsif.acc.c2tc.interview_questions.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsKeywordDemo {
    // The 'throws' keyword delegates the responsibility of handling the exception to the caller
    static void readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file); // This can trigger a FileNotFoundException
        
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public static void main(String[] args) {
        try {
            // The caller MUST handle the checked exception
            readFile("missing_document.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: The specified file could not be found on the system.");
        }
    }
}
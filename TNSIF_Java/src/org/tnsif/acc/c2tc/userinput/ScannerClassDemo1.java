package org.tnsif.acc.c2tc.userinput;

import java.util.Scanner;

public class ScannerClassDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter M or F: ");
		char gender = sc.next().charAt(0);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();

		System.out.println("Name: " + name + " | Age: " + age + " | Gender: " + gender);
		sc.close();
	}
}

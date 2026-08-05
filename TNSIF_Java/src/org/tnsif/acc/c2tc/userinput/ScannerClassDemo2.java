package org.tnsif.acc.c2tc.userinput;

import java.util.Scanner;

public class ScannerClassDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter your name: ");
		String name = sc.nextLine();

		System.out.println("Name: " + name + " | Age: " + age);
		sc.close();
	}	
}

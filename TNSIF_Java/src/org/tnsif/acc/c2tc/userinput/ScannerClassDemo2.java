package org.tnsif.acc.c2tc.userinput;

import java.util.Scanner;

public class ScannerClassDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String name = scan.nextLine();

		System.out.println("Enter your age: ");
		int age = scan.nextInt();

		System.out.println("Enter your Height: ");
		float height = scan.nextFloat();

		System.out.println("Are you a Student: ");
		boolean is_Student = scan.nextBoolean();

		System.out.println("Enter your aadhar num: ");
		long aadhar = scan.nextLong();
		scan.nextLine();

		System.out.println("Enter your favorite Teacher Name: ");
		String teacher = scan.nextLine();

		System.out.println("Enter your Hobby: ");
		String hobby = scan.nextLine();

		System.out.println("Enter your daily reading time in minute: ");
		byte readingtime = scan.nextByte();

		System.out.println("Enter your cgpa: ");
		double cgpa = scan.nextDouble();

		System.out.println("Enter no of siblings: ");
		short noofsib = scan.nextShort();

		System.out.println("____________________________");
		System.out.println(" Student information");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Height: " + height);
		System.out.println("isstudent: " + is_Student);
		System.out.println("aadhar: " + aadhar);
		System.out.println("Favorite Teacher: " + teacher);
		System.out.println("Hobby: " + hobby);
		System.out.println("Reading time: " + readingtime);
		System.out.println("cgpa: " + cgpa);
		System.out.println("Siblings: " + noofsib);
		System.out.println("____________________________");
		scan.close();
	}
}

package org.tnsif.acc.c2tc.interview_questions.basics;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Fibonacci Series needed: ");
		int n = sc.nextInt();
		
		int a = 0;
		int b = 1;
		
		System.out.print(a + " " + b + " ");
		
		for(int i = 2; i < n; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}
		sc.close();

	}

}

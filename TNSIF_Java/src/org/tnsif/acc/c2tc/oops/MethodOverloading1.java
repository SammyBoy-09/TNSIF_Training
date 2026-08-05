package org.tnsif.acc.c2tc.oops;

public class MethodOverloading1 {

	static void add(int a, int b, int c) {
		System.out.println("Sum1: " + (a + b + c));
	}

	static void add(int a, double b, int c) {
		System.out.println("Sum2: " + (a + b + c));
	}

	public static void main(String[] args) {
		add(2, 2.0, 2);
		add(2, 3, 8);
	}	
}

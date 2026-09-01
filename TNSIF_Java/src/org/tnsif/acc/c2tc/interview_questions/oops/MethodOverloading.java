package org.tnsif.acc.c2tc.interview_questions.oops;

class MathOperations {
	// Overloaded method 1: adds two integers
	int add(int a, int b) {
		return a + b;
	}

	// Overloaded method 2: adds three integers
	int add(int a, int b, int c) {
		return a + b + c;
	}

	// Overloaded method 3: adds two doubles
	double add(double a, double b) {
		return a + b;
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		MathOperations math = new MathOperations();
		System.out.println("Add 2 ints: " + math.add(5, 10));
		System.out.println("Add 3 ints: " + math.add(5, 10, 15));
		System.out.println("Add 2 doubles: " + math.add(5.5, 2.5));
	}
}
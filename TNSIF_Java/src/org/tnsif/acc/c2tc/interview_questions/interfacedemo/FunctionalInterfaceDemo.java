package org.tnsif.acc.c2tc.interview_questions.interfacedemo;

@FunctionalInterface
interface MathOperation {
	int operate(int a, int b);
}

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		// Implementing the single abstract method using a lambda expression
		MathOperation addition = (a, b) -> a + b;
		System.out.println("Sum: " + addition.operate(5, 10));
	}
}
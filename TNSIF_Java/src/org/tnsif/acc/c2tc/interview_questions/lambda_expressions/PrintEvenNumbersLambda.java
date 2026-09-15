package org.tnsif.acc.c2tc.interview_questions.lambda_expressions;

import java.util.*;

public class PrintEvenNumbersLambda {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.print("Even numbers: ");

		// Block lambda expression
		numbers.forEach(n -> {
			if (n % 2 == 0) {
				System.out.print(n + " ");
			}
		});
	}
}
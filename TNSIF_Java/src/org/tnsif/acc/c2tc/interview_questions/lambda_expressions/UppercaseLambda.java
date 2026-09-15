package org.tnsif.acc.c2tc.interview_questions.lambda_expressions;

import java.util.*;

public class UppercaseLambda {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("john", "mary", "peter");

		// Lambda transforms each string to its uppercase version
		names.replaceAll(name -> name.toUpperCase());

		System.out.println("Uppercase names: " + names);
	}
}
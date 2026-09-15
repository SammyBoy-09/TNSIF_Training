package org.tnsif.acc.c2tc.interview_questions.lambda_expressions;

import java.util.*;

public class FilterStringsLambda {
	public static void main(String[] args) {
		// Using an ArrayList because Arrays.asList() creates a fixed-size list
		List<String> words = new ArrayList<>(Arrays.asList("cat", "apple", "dog", "banana", "kiwi"));

		// Lambda removes the element if the condition is true
		words.removeIf(s -> s.length() < 5);

		System.out.println("Strings with 5 or more characters: " + words);
	}
}
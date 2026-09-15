package org.tnsif.acc.c2tc.interview_questions.collections.list_interface;

import java.util.*;

public class RemoveEvenNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

		// Uses an implicit iterator to safely remove items
		numbers.removeIf(n -> n % 2 == 0);

		System.out.println("Odd numbers only: " + numbers);
	}
}

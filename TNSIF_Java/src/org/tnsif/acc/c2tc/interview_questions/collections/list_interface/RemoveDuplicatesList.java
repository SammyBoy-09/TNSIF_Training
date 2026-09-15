package org.tnsif.acc.c2tc.interview_questions.collections.list_interface;

import java.util.*;

public class RemoveDuplicatesList {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(4, 1, 2, 1, 4, 3));

		// Convert to LinkedHashSet to remove duplicates, then back to List
		List<Integer> uniqueNumbers = new ArrayList<>(new LinkedHashSet<>(numbers));

		System.out.println("Unique List: " + uniqueNumbers);
	}
}

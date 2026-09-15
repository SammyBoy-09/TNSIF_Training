package org.tnsif.acc.c2tc.interview_questions.collections.list_interface;

import java.util.*;

public class FirstNonRepeating {
	public static void main(String[] args) {
		List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
		Map<String, Integer> counts = new LinkedHashMap<>();

		for (String item : items) {
			counts.put(item, counts.getOrDefault(item, 0) + 1);
		}

		for (Map.Entry<String, Integer> entry : counts.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("First non-repeating element: " + entry.getKey());
				break;
			}
		}
	}
}

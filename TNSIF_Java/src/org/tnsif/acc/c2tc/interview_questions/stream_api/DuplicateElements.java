package org.tnsif.acc.c2tc.interview_questions.stream_api;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElements {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		Set<Integer> seen = new HashSet<>();

		Set<Integer> duplicates = numbers.stream().filter(n -> !seen.add(n)) // true if 'n' was already in 'seen'
				.collect(Collectors.toSet());

		System.out.println("Duplicate elements: " + duplicates);
	}
}
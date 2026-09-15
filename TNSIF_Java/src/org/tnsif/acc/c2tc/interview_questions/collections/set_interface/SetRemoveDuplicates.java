package org.tnsif.acc.c2tc.interview_questions.collections.set_interface;

import java.util.*;
import java.util.stream.Collectors;

public class SetRemoveDuplicates {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "A", "C", "B");

		// Java 8 stream approach using LinkedHashSet for order preservation
		List<String> distinctList = list.stream().distinct() // distinct() uses a LinkedHashSet under the hood
				.collect(Collectors.toList());

		System.out.println("Distinct items: " + distinctList);
	}
}

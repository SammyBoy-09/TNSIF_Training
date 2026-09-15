package org.tnsif.acc.c2tc.interview_questions.collections.set_interface;

import java.util.*;

public class CommonElements {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4 };
		Integer[] arr2 = { 4, 5, 6, 7 };

		Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));

		// Retains only the elements in set1 that are contained in arr2
		set1.retainAll(Arrays.asList(arr2));

		if (!set1.isEmpty()) {
			System.out.println("Common elements found: " + set1);
		} else {
			System.out.println("No common elements.");
		}
	}
}
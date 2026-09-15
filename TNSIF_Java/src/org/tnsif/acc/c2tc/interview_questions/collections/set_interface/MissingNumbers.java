package org.tnsif.acc.c2tc.interview_questions.collections.set_interface;

import java.util.*;

public class MissingNumbers {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 5, 7, 8 };
		int N = 8;

		Set<Integer> presentNumbers = new HashSet<>();
		for (int num : arr) {
			presentNumbers.add(num);
		}

		List<Integer> missing = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			if (!presentNumbers.contains(i)) {
				missing.add(i);
			}
		}
		System.out.println("Missing numbers: " + missing);
	}
}

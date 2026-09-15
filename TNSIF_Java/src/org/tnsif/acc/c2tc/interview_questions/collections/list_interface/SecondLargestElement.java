package org.tnsif.acc.c2tc.interview_questions.collections.list_interface;

import java.util.*;

public class SecondLargestElement {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 5, 20, 20, 8);
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : numbers) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}
		System.out.println("Second largest: " + secondLargest);
	}
}
package org.tnsif.acc.c2tc.interview_questions.generics;

public class GenericMaxDemo {

	// <T extends Comparable<T>> bounds the type parameter
	public static <T extends Comparable<T>> T findMax(T x, T y, T z) {
		T max = x; // Assume x is initially the largest

		if (y.compareTo(max) > 0) {
			max = y; // y is larger
		}
		if (z.compareTo(max) > 0) {
			max = z; // z is largest
		}

		return max;
	}

	public static void main(String[] args) {
		System.out.println("Max of 3, 7, 5 is: " + findMax(3, 7, 5));
		System.out.println("Max of 6.6, 8.8, 7.7 is: " + findMax(6.6, 8.8, 7.7));
		System.out.println("Max of Apple, Pear, Orange is: " + findMax("Apple", "Pear", "Orange"));
	}
}
package org.tnsif.acc.c2tc.interview_questions.generics;

public class GenericArrayDemo {

	// Generic method to print any array type
	public static <E> void printArray(E[] inputArray) {
		for (E element : inputArray) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.print("Integer Array: ");
		printArray(intArray);

		System.out.print("Double Array: ");
		printArray(doubleArray);

		System.out.print("Character Array: ");
		printArray(charArray);
	}
}
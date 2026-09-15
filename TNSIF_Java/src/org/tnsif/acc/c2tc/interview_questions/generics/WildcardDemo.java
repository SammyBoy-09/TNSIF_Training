package org.tnsif.acc.c2tc.interview_questions.generics;

import java.util.Arrays;
import java.util.List;

public class WildcardDemo {

	// List<?> accepts a List of any type
	public static void printList(List<?> list) {
		for (Object element : list) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(10, 20, 30);
		List<String> stringList = Arrays.asList("Java", "Generics", "Wildcards");

		System.out.print("Integer List: ");
		printList(intList);

		System.out.print("String List: ");
		printList(stringList);
	}
}
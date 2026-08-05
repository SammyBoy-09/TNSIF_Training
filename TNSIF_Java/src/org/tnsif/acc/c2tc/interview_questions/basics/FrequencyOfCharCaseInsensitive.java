package org.tnsif.acc.c2tc.interview_questions.basics;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfCharCaseInsensitive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the elements: ");
		String str = sc.nextLine();
		char[] ch = str.toLowerCase().toCharArray();
		HashMap<Character, Integer> freq = new HashMap<Character, Integer>();
		for (char c : ch) {
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}

		System.out.println(freq);
		sc.close();
	}
}

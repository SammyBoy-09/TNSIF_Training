package org.tnsif.acc.c2tc.interview_questions.basics;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s1 = sc.next();
		int r = s1.length() - 1;
		int l = 0;
		char[] sChar = s1.toCharArray();
		while (l < r) {
			char temp = sChar[l];
			sChar[l] = sChar[r];
			sChar[r] = temp;
			l++;
			r--;
		}

		String reverse = new String(sChar);

		System.out.println("Reversed String: " + reverse);
		sc.close();

	}

}

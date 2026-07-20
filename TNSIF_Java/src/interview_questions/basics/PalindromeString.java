package interview_questions.basics;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s1 = sc.next();
		int r = s1.length() - 1;
		int l = 0;
		int flag = 0;
		while (l < r) {
			if (s1.charAt(l) != s1.charAt(r)) {
				flag = 1;
				break;
			}
			r--;
			l++;
		}
		if (flag == 1)
			System.out.println("Not a Palindrome String");
		else
			System.out.println("Palindrome String");
		sc.close();
	}

}

package interview_questions.basics;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int reverse = 0;
		int temp = num;
		while(num > 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}
		if(temp == reverse)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not a Palindrome Number");
		sc.close();
	}

}

package interview_questions.basics;

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the elements: ");
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int sec_max = Integer.MIN_VALUE;
		for(int num : arr) {
			if(num > max) {
				sec_max = max;
				max = num;				
			}
			else if(num > sec_max && num != max) {
				sec_max = num;
			}
		}
		System.out.println("Second Largest Number: "+sec_max);
		sc.close();

	}

}

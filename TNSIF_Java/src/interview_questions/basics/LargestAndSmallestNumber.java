package interview_questions.basics;

import java.util.Scanner;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the elements: ");
		for(int i = 0; i< n; i++)
			arr[i] = sc.nextInt();
		
		int l = Integer.MIN_VALUE;
		int s = Integer.MAX_VALUE;
		
		for(int i = 0; i < n; i++) {
			l = (l > arr[i])? l : arr[i];
			s = (s < arr[i])? s : arr[i];
		}
		System.out.println("Largest: "+ l + " | Smallest : " + s);
		sc.close();
	}

}

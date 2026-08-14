package org.tnsif.acc.c2tc.exceptionhandling;

public class ErrorsDemo {
	public static int add(int num1, int num2) {
		return num1 - num2;	// <-- Logical Error 
	}
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
	//	int num3 = 10   <-- Compile Time Error:  missing semicolon
		
		int sum = add(num1, num2);
		System.out.println(sum);
	}

}

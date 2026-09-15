package org.tnsif.acc.c2tc.interview_questions.collections.queue_interface;

import java.util.*;

public class GenerateBinaryNumbers {
	public static void main(String[] args) {
		int n = 5;
		Queue<String> q = new LinkedList<>();
		q.offer("1");

		System.out.print("Binary numbers: ");
		for (int i = 0; i < n; i++) {
			String current = q.poll();
			System.out.print(current + " ");

			q.offer(current + "0");
			q.offer(current + "1");
		}
	}
}
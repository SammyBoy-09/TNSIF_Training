package org.tnsif.acc.c2tc.interview_questions.collections.queue_interface;

import java.util.*;

public class FirstNonRepeatingStream {
	public static void main(String[] args) {
		String stream = "aabc";
		int[] charCounts = new int[26];
		Queue<Character> queue = new LinkedList<>();

		System.out.print("First non-repeating for each insertion: ");
		for (char c : stream.toCharArray()) {
			queue.offer(c);
			charCounts[c - 'a']++;

			// Remove repeating characters from the front of the queue
			while (!queue.isEmpty() && charCounts[queue.peek() - 'a'] > 1) {
				queue.poll();
			}

			if (queue.isEmpty())
				System.out.print("-1 ");
			else
				System.out.print(queue.peek() + " ");
		}
	}
}
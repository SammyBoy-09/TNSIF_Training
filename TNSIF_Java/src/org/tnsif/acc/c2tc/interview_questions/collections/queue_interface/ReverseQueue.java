package org.tnsif.acc.c2tc.interview_questions.collections.queue_interface;

import java.util.*;

public class ReverseQueue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
		Stack<Integer> stack = new Stack<>();

		while (!queue.isEmpty()) {
			stack.push(queue.poll());
		}
		while (!stack.isEmpty()) {
			queue.offer(stack.pop());
		}

		System.out.println("Reversed Queue: " + queue);
	}
}
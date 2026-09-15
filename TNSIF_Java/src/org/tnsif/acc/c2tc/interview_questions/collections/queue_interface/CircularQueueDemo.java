package org.tnsif.acc.c2tc.interview_questions.collections.queue_interface;

class CircularQueue {
	int[] queue;
	int front = -1, rear = -1, size;

	CircularQueue(int size) {
		this.size = size;
		queue = new int[size];
	}

	void enqueue(int value) {
		if ((front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1))) {
			System.out.println("Queue is Full");
			return;
		} else if (front == -1) {
			front = rear = 0;
		} else if (rear == size - 1 && front != 0) {
			rear = 0;
		} else {
			rear++;
		}
		queue[rear] = value;
	}

	int dequeue() {
		if (front == -1) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int data = queue[front];
		queue[front] = -1;
		if (front == rear) { // Last element
			front = rear = -1;
		} else if (front == size - 1) {
			front = 0;
		} else {
			front++;
		}
		return data;
	}
}

public class CircularQueueDemo {
	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(3);
		cq.enqueue(10);
		cq.enqueue(20);
		cq.enqueue(30);
		System.out.println("Dequeued: " + cq.dequeue());
		cq.enqueue(40); // Wraps around
	}
}
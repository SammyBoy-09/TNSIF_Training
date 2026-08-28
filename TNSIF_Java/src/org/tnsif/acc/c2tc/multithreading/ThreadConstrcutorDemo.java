package org.tnsif.acc.c2tc.multithreading;

class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Eclipse id " + " " + Thread.currentThread().getName());
	}
}

public class ThreadConstrcutorDemo {

	public static void main(String[] args) {
		Thread thread1 = new Thread();
		thread1.setName("Thread 1");
		thread1.start();
		System.out.println("Thread name :" + thread1.getName());

		Thread thread2 = new Thread("Thread 2");
		thread2.start();
		System.out.println("Thread name :" + thread2.getName());

		MyRunnable myrunnable = new MyRunnable();
		Thread thread3 = new Thread(myrunnable);
		thread3.start();

		Thread thread4 = new Thread(myrunnable, "Thread 4");
		thread4.start();
	}
}
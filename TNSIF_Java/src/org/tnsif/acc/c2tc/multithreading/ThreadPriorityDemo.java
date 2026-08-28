package org.tnsif.acc.c2tc.multithreading;

class Eclipse2 extends Thread {
	public void run() {
		System.out.println("Eclipse id " + " " + Thread.currentThread().getId());
	}
}

class OneNote2 extends Thread {
	public void run() {
		System.out.println("OneNote id " + " " + Thread.currentThread().getId());
	}
}

class Chrome2 extends Thread {
	public void run() {
		System.out.println("Chrome id " + " " + Thread.currentThread().getId());
	}
}

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		Eclipse2 eclipse = new Eclipse2();
		eclipse.start();
		eclipse.setPriority(5);
		Chrome2 chrome = new Chrome2();
		chrome.start();
		chrome.setPriority(10);
		OneNote2 onenote = new OneNote2();
		onenote.start();
		onenote.setPriority(1);
	}
}
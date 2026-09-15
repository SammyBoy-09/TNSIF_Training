package org.tnsif.acc.c2tc.interview_questions.basics;

//1. Create the Singleton class
class Singleton {

	// Create the only instance right when the class loads
	private static final Singleton instance = new Singleton();

	// Private constructor so nobody else can say "new Singleton()"
	private Singleton() {
		// Keeps others from making new copies
	}

	// Public method so anyone can grab the single instance
	public static Singleton getInstance() {
		return instance;
	}

	// A simple method to test that it works
	public void sayHello() {
		System.out.println("Hello from the Singleton!");
	}
}

//2. Main class to test it
public class SingletonDemo {
	public static void main(String[] args) {
		// You CANNOT do this (it will cause an error):
		// Singleton obj = new Singleton();

		// Instead, grab the allowed instance:
		Singleton firstCall = Singleton.getInstance();
		Singleton secondCall = Singleton.getInstance();

		// Prove they are the exact same object
		if (firstCall == secondCall) {
			System.out.println("Success! Both variables share the exact same object.");
		}
	}
}
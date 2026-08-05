package org.tnsif.acc.c2tc.interview_questions.accessmodifier;

class DatabaseConnection {
	// 1. Create a private constructor
	private DatabaseConnection() {
		System.out.println("Database Connection Created.");
	}

	// 2. Provide a static method to control how the object is created
	public static DatabaseConnection getInstance() {
		return new DatabaseConnection();
	}

	public void connect() {
		System.out.println("Connected to the database successfully!");
	}
}

public class PrivateConstructorDemo {
	public static void main(String[] args) {
		// DatabaseConnection db = new DatabaseConnection(); // ERROR: constructor is private


		// We must use the provided public static method to get an instance
		DatabaseConnection db = DatabaseConnection.getInstance();
		db.connect();
	}
}

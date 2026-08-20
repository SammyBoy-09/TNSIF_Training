package org.tnsif.acc.c2tc.oops;

class User {
	String name;
	int age;

	// Default constructor
	User() {
		name = "Sushma";
		age = 23;
		System.out.println("User created age " + name + " " + age);
	}

	User(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("User created age " + name + " " + age);
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		User user = new User();
		User user1 = new User("Sam", 26);

	}

}
package org.tnsif.acc.c2tc.interview_questions.oops;

class Animal {
	void makeSound() {
		System.out.println("Generic animal sound");
	}
}

class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("Bark");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.makeSound(); // Calls the overridden method in Dog
	}
}
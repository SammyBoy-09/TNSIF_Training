package org.tnsif.acc.c2tc.interview_questions.inheritance;

class Vehicle {
	void startEngine() {
		System.out.println("Engine started.");
	}
}

class Car extends Vehicle {
	void drive() {
		System.out.println("Car is driving.");
	}
}

public class SingleInheritanceDemo {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.startEngine(); // Inherited from Vehicle
		myCar.drive(); // Defined in Car
	}
}

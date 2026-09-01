package org.tnsif.acc.c2tc.interview_questions.oops;

class Employee {
	void work() {
		System.out.println("Employee is working.");
	}
}

class Developer extends Employee {
	@Override
	void work() {
		System.out.println("Developer is writing code.");
	}
}

class Manager extends Employee {
	@Override
	void work() {
		System.out.println("Manager is planning the project.");
	}
}

public class RuntimePolymorphismDemo {
	public static void main(String[] args) {
		// Parent reference holding child objects
		Employee emp1 = new Developer();
		Employee emp2 = new Manager();

		// Method execution depends on the actual object created
		emp1.work(); // Outputs Developer's work
		emp2.work(); // Outputs Manager's work
	}
}
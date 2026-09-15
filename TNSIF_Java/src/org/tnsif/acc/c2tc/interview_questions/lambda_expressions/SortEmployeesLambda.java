package org.tnsif.acc.c2tc.interview_questions.lambda_expressions;

import java.util.*;

class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return name + " (₹" + salary + ")";
	}
}

public class SortEmployeesLambda {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Alice", 60000), new Employee("Bob", 45000),
				new Employee("Charlie", 75000));

		// Lambda expression for descending order comparison
		employees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));

		System.out.println("Sorted by salary (descending):");
		employees.forEach(e -> System.out.println(e));
	}
}
package org.tnsif.acc.c2tc.interview_questions.stream_api;

import java.util.*;

class Employee {
	String name;
	String department;
	double salary;

	public Employee(String name, String department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class SecondHighestSalary {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Alice", "IT", 70000), new Employee("Bob", "HR", 80000),
				new Employee("Charlie", "IT", 90000), new Employee("David", "Finance", 80000));

		Optional<Double> secondHighest = employees.stream().map(Employee::getSalary).distinct()
				.sorted(Comparator.reverseOrder()).skip(1) // Skip the highest salary
				.findFirst();

		secondHighest.ifPresent(salary -> System.out.println("Second highest salary: " + salary));
	}
}
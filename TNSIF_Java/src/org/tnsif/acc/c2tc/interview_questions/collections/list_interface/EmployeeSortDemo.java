package org.tnsif.acc.c2tc.interview_questions.collections.list_interface;

import java.util.*;

class Employee {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return name + " ($" + salary + ")";
	}
}

public class EmployeeSortDemo {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1, "Alice", 70000), new Employee(2, "Bob", 80000),
				new Employee(3, "Charlie", 80000));

		employees.sort(Comparator.comparing(Employee::getSalary).reversed().thenComparing(Employee::getName));

		System.out.println("Sorted Employees: " + employees);
	}
}

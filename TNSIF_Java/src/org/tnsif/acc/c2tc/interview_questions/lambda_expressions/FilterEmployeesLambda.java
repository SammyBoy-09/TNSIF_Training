package org.tnsif.acc.c2tc.interview_questions.lambda_expressions;

import java.util.*;
import java.util.stream.Collectors;

public class FilterEmployeesLambda {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Alice", 60000), new Employee("Bob", 45000),
				new Employee("Charlie", 75000));

		// Lambda filters employees earning more than 50,000
		List<Employee> highEarners = employees.stream().filter(e -> e.getSalary() > 50000).collect(Collectors.toList());

		System.out.println("High Earners: " + highEarners);
	}
}
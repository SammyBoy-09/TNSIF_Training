package org.tnsif.acc.c2tc.interview_questions.stream_api;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByDepartment {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Alice", "IT", 70000), new Employee("Bob", "HR", 80000),
				new Employee("Charlie", "IT", 90000));

		Map<String, List<Employee>> byDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

		byDept.forEach((dept, empList) -> System.out.println(dept + ": " + empList));
	}
}
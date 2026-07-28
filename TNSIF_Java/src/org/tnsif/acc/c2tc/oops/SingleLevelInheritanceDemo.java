package org.tnsif.acc.c2tc.oops;

//parent Class
class Course {
	String courseName = "Java Programming";

	void showCoruse() {
		System.out.println("Course: " + courseName);
	}
}

//Child Class
class Student extends Course {
	String name = "Sam";

	void showStudent() {
		System.out.println("Student: " + name);
	}
}

public class SingleLevelInheritanceDemo {

	public static void main(String[] args) {
		Student student = new Student();
		student.showStudent();
		student.showCoruse();
	}
}
package org.tnsif.acc.c2tc.methodoverriding;

class Person {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String name;
	private int age;

	void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

}

public class ThisDemo1 {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Sam");
		person.setAge(25);
		person.displayDetails();
		System.out.println(" ");

		person.setName("Lazar");
		person.setAge(50);
		person.displayDetails();

	}
}

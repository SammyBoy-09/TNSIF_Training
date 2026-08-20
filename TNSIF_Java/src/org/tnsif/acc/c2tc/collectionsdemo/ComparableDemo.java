package org.tnsif.acc.c2tc.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

class Person2 implements Comparable<Person2> {

	String name;
	int age;

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println("Name: " + name + "\t| Age: " + age);
	}

	@Override
	public int compareTo(Person2 other) {
		return this.name.compareTo(other.name);
	}
}

public class ComparableDemo {
	public static void main(String[] args) {
		ArrayList<Person2> people = new ArrayList<>();
		people.add(new Person2("John", 30));
		people.add(new Person2("Anil", 20));
		people.add(new Person2("Basker", 18));

		Collections.sort(people);

		for (Person2 person : people) {
			person.display();
		}
	}
}

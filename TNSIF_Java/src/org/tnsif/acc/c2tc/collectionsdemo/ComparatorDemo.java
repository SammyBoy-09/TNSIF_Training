package org.tnsif.acc.c2tc.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person3 {

	String name;
	int age;

	public Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println("Name: " + name + "\t| Age: " + age);
	}
}

class NameComparator implements Comparator<Person3> {

	@Override
	public int compare(Person3 p1, Person3 p2) {
		return p1.name.compareTo(p2.name);
	}

}

class AgeComparator implements Comparator<Person3> {

	@Override
	public int compare(Person3 p1, Person3 p2) {
		return Integer.compare(p1.age, p2.age);
	}

}

public class ComparatorDemo {
	public static void main(String[] args) {
		ArrayList<Person3> people = new ArrayList<>();
		people.add(new Person3("Sushma", 34));
		people.add(new Person3("Akash", 25));
		people.add(new Person3("Hema", 17));

		Collections.sort(people, new NameComparator());
		System.out.println("Sorted by Name -");

		for (Person3 person : people) {
			person.display();
		}

		System.out.println();

		Collections.sort(people, new AgeComparator());
		System.out.println("Sorted by Age -");

		for (Person3 person : people) {
			person.display();
		}
	}
}

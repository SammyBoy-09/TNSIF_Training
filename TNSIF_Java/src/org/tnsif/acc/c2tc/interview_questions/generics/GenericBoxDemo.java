package org.tnsif.acc.c2tc.interview_questions.generics;

class Box<T> {
	private T item;

	public void setItem(T item) {
		this.item = item;
	}

	public T getItem() {
		return item;
	}
}

public class GenericBoxDemo {
	public static void main(String[] args) {
		// Box for a String
		Box<String> stringBox = new Box<>();
		stringBox.setItem("Hello Generics");
		System.out.println("String Box contains: " + stringBox.getItem());

		// Box for an Integer
		Box<Integer> intBox = new Box<>();
		intBox.setItem(42);
		System.out.println("Integer Box contains: " + intBox.getItem());
	}
}
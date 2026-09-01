package org.tnsif.acc.c2tc.interview_questions.oops;

abstract class Shape {
	abstract void draw(); // Abstract method (no body)

	void display() { // Concrete method
		System.out.println("Displaying the shape.");
	}
}

class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing a Circle.");
	}
}

public class AbstractionDemo {
	public static void main(String[] args) {
		Shape myShape = new Circle();
		myShape.draw();
		myShape.display();
	}
}

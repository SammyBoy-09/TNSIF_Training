package org.tnsif.acc.c2tc.interview_questions.packages.userdefinedpackage;

import org.tnsif.acc.c2tc.interview_questions.packages.samplepackage2.*;

import org.tnsif.acc.c2tc.interview_questions.packages.userdefinedpackage.subpackage.*;

public class SampleClass {

	public static void display() {
		System.out.println("Hello from the User-defined Package!!!");
	}

	public static void main(String[] args) {
		display();

		ImportDemo obj = new ImportDemo();
		obj.display();

		SubPackageDemo obj2 = new SubPackageDemo();
		obj2.display3();

	}

}

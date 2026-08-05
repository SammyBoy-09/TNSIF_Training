package org.tnsif.acc.c2tc.interview_questions.accessmodifier;

class AccessModifiers {
	public String publicVar = "I am Public - Accessible everywhere";
	protected String protectedVar = "I am Protected - Accessible in same package and subclasses";
	String defaultVar = "I am Default - Accessible only in the same package";
	private String privateVar = "I am Private - Accessible only within this class";

	// A public method to access the privated variable
	public void printPrivate() {
		System.out.println(privateVar);
	}
}

public class AccessModifiersDemo {
	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();

		System.out.println(obj.publicVar);
		System.out.println(obj.protectedVar);
		System.out.println(obj.defaultVar);

		//System.out.println(obj.privateVar); // ERROR: privateVar has private access

		obj.printPrivate();
	}

}

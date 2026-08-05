package org.tnsif.acc.c2tc.methodoverriding;

class Payment1 {
	void process() {
		System.out.println("Processing payment using Standard gateway.");
	}
}

class Gpay extends Payment1 {
	void process() {
		System.out.println("Processiong payment via Google Pay!!");
	}
	
	void completeTransaction() {
		super.process();
		process();
	}
}

public class SuperWithMethod {
	public static void main(String[] args) {
		Gpay obj = new Gpay();
		obj.completeTransaction();
	}
}
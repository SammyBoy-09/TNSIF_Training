package org.tnsif.acc.c2tc.methodoverriding;

class Notification {
	String message = " Default Notification";
}

class PushNotification extends Notification {
	String message = "Push Notification";

	void showNotification() {
		System.out.println("Child message :" + message);
		System.out.println("Parent message : " + super.message);
	}
}

public class SuperWithVariable {

	public static void main(String[] args) {
		PushNotification obj = new PushNotification();
		obj.showNotification();
	}
}
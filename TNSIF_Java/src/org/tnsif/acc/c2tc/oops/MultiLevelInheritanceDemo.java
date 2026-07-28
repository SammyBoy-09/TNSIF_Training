package org.tnsif.acc.c2tc.oops;

class Device {
	void deviceType() {
		System.out.println("I'm am an electronic device.");
	}
}

class Phone extends Device {
	void brand() {
		System.out.println("Brand: Samsung");
	}
}

class SmartPhone extends Phone {
	void features() {
		System.out.println("Features: Touchscreen, Camera, Internet");
	}
}

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		SmartPhone obj = new SmartPhone();
		obj.deviceType();
		obj.brand();
		obj.features();
	}
}
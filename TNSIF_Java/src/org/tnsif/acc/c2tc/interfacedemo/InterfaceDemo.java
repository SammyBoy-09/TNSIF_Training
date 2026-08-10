package org.tnsif.acc.c2tc.interfacedemo;

class SmartLight implements SmartDevice{

	@Override
	public void turnOn() {
		System.out.println("Smart Light is On.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Smart Light is Off.");
	}

	@Override
	public void getStatus() {
		System.out.println("Smart Light is on StandBy Mode.");
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		SmartDevice smart = new SmartLight();
		smart.turnOn();
		smart.turnOff();
		smart.getStatus();

	}

}

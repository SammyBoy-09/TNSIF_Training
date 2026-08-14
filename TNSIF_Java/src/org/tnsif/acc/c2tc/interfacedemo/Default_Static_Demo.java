package org.tnsif.acc.c2tc.interfacedemo;

interface Vehicle {
	void start();

	void stop();

	final static int Max_speed = 120;

	public default void repair() {
		System.out.println("We provide repair service.");
	}

	static void checkMaintaince() {
		System.out.println("Vehicle maintaince taken care here.");
	}
}

class Car implements Vehicle {
	private String model;

	Car(String model) {
		this.model = model;
	}

	@Override
	public void start() {
		System.out.println("Car " + model + " starting...");

	}

	@Override
	public void stop() {
		System.out.println("Car " + model + " stopping...");
	}

	@Override
	public void repair() {
		System.out.println("We provide repair service to your Car.");
	}
}

class Bike implements Vehicle {

	private String type;

	Bike(String type) {
		this.type = type;
	}

	@Override
	public void start() {
		System.out.println("Bike " + type + " starting");

	}

	@Override
	public void stop() {
		System.out.println("Bike " + type + " stopping");
	}

	@Override
	public void repair() {
		System.out.println("We provide repair service to your Bike.");
	}
}

public class Default_Static_Demo {

	public static void main(String[] args) {
		Vehicle car = new Car("KIA");
		Vehicle bike = new Bike("RX 100");

		car.start();
		car.stop();

		bike.start();
		bike.stop();

		car.repair();
		bike.repair();

		Vehicle.checkMaintaince();

		System.out.println("MaxSpeed " + Vehicle.Max_speed);

	}

}
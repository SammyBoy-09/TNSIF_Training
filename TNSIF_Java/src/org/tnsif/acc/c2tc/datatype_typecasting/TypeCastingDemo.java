package org.tnsif.acc.c2tc.datatype_typecasting;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// Shopping Cart

		// Widening (Small -> Large)
		double pricePerItem = 99.50;
		int quantity = 3;
		double totalPrice = quantity * pricePerItem;

		// narrowing ( large -> small)
		double discount = 10.75;
		int roundedDiscount = (int) discount;

		double finalAmount = totalPrice - roundedDiscount;

		System.out.println("Online Shopping Summary");
		System.out.println("Items Bought: " + quantity);
		System.out.println("Price per item: " + pricePerItem);
		System.out.println("Final Anount to pay after discount: " + finalAmount);

	}

}

package org.tnsif.acc.c2tc.oops;

public class FoodItem {
	
	//variables	
	String name;
	double price;
	String category;
	
	//method	
	void displayDetails() {
		System.out.println("Food Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Category: " + category);
	}
	
	public static void main(String[] args) {
		FoodItem item1 = new FoodItem();
		item1.name = "Burger";
		item1.price = 299.99;
		item1.category = "Fast Food";
		item1.displayDetails();
		System.out.println("");
		
		FoodItem item2 = new FoodItem();
		item2.name = "Biriyani";
		item2.price = 499.99;
		item2.category = "Rice";
		item2.displayDetails();
		
		
	}

}

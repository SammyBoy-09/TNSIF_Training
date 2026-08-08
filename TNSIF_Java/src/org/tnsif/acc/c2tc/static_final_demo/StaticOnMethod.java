package org.tnsif.acc.c2tc.static_final_demo;

class PaymentMethod {
	static void showSupportedBanks() {
		System.out.println("Supported Bank: SBI, HDFC, ICICI, Axis.");
	}
}

public class StaticOnMethod {

	public static void main(String[] args) {
		PaymentMethod.showSupportedBanks();
	}

}

package org.tnsif.acc.c2tc.static_final_demo;

class Bank {
	final void security_Rule() {
		System.out.println("Follow KYC and OTP verification.");
	}
}

class SBI extends Bank {
//	void security_Rule()  //  <-- Cant be overwritten
//	{
//		System.out.println("No need of kyc , just otp");
//	}
}

public class FinalOnMethod {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.security_Rule();

	}

}

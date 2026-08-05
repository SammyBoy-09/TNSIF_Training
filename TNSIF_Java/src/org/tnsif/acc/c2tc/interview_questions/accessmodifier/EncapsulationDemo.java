package org.tnsif.acc.c2tc.interview_questions.accessmodifier;

class BankAccount {
	// Data hiding: The outside world cannot change this variable directly
	private double balance;

	public BankAccount(double initialBalance) {
		if (initialBalance > 0) {
			this.balance = initialBalance;
		}
	}

	// Controlled modification: We validate data before changing the state
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: $" + amount);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}
	
	public void withdraw (double amount) {
		if ((amount > 0) && ((balance - amount) > 0)){
			System.out.println("Withdrawal of $" + amount + " was successful!!!");
		}
		else
			System.out.println("Transaction Unsuccessful!!!");
	}

	// Controlled access: We only allow reading the balance, not changing it
	// directly
	public double getBalance() {
		return balance;
	}
}

public class EncapsulationDemo {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(500.0);

		// account.balance = 1000000; // ERROR: Data is hidden!

		account.deposit(150.0);
		account.deposit(-50.0); // Will be rejected by our validation

		System.out.println("Current Balance: $" + account.getBalance());
	}
}

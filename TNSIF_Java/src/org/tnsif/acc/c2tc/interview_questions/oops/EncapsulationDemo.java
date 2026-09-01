package org.tnsif.acc.c2tc.interview_questions.oops;

class BankAccount {
	private double balance; // Hidden data

	public BankAccount(double initialBalance) {
		if (initialBalance > 0) {
			this.balance = initialBalance;
		}
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: $" + amount);
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrew: $" + amount);
		} else {
			System.out.println("Insufficient funds.");
		}
	}

	public double getBalance() {
		return balance;
	}
}

public class EncapsulationDemo {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(500);
		account.deposit(200);
		account.withdraw(100);
		System.out.println("Current Balance: $" + account.getBalance());
	}
}
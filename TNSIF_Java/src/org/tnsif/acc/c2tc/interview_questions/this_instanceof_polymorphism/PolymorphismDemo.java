package org.tnsif.acc.c2tc.interview_questions.this_instanceof_polymorphism;

class PaymentMethod {
    void processPayment() {
        System.out.println("Processing a generic payment.");
    }
}

class CreditCard extends PaymentMethod {
    @Override
    void processPayment() {
        System.out.println("Processing credit card payment.");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        PaymentMethod payment = new CreditCard();
        payment.processPayment(); // Executes the CreditCard implementation
    }
}
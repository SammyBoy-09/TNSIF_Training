package org.tnsif.acc.c2tc.interview_questions.interfacedemo;

interface PaymentProcessor { 
    void processPayment(double amount); 
}

class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) { 
        System.out.println("Processed $" + amount + " via Credit Card."); 
    }
}

class CheckoutService {
    private PaymentProcessor processor;
    
    // The service doesn't care which processor is used, just that it implements the interface
    CheckoutService(PaymentProcessor processor) { 
        this.processor = processor; 
    }
    
    void completeOrder(double amount) { 
        processor.processPayment(amount); 
    }
}

public class LooseCouplingDemo {
    public static void main(String[] args) {
        PaymentProcessor cardPayment = new CreditCardProcessor();
        CheckoutService checkout = new CheckoutService(cardPayment);
        checkout.completeOrder(150.75);
    }
}
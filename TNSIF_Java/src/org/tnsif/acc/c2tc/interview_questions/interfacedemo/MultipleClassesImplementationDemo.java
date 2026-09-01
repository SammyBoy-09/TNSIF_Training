package org.tnsif.acc.c2tc.interview_questions.interfacedemo;

interface Notification { 
    void send(String message); 
}

class EmailNotification implements Notification {
    @Override
    public void send(String message) { 
        System.out.println("Sending Email: " + message); 
    }
}

class SMSNotification implements Notification {
    @Override
    public void send(String message) { 
        System.out.println("Sending SMS: " + message); 
    }
}

public class MultipleClassesImplementationDemo {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();
        
        email.send("Welcome to our platform!");
        sms.send("Your OTP is 123456.");
    }
}

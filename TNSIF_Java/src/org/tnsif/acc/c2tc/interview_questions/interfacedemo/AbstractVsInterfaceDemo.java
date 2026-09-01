package org.tnsif.acc.c2tc.interview_questions.interfacedemo;

abstract class AbstractDevice {
    String brand;
    
    AbstractDevice(String brand) { 
        this.brand = brand; 
    }
    
    abstract void turnOn(); // Abstract class can have constructors and state
}

interface Connectable {
    void connectToWiFi(); // Interface defines pure behavior
}

class Smartphone extends AbstractDevice implements Connectable {
    Smartphone(String brand) { 
        super(brand); 
    }
    
    @Override
    void turnOn() { 
        System.out.println(brand + " smartphone is turning on."); 
    }
    
    @Override
    public void connectToWiFi() { 
        System.out.println("Connected to 5G WiFi."); 
    }
}

public class AbstractVsInterfaceDemo {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("TechBrand");
        phone.turnOn();
        phone.connectToWiFi();
    }
}

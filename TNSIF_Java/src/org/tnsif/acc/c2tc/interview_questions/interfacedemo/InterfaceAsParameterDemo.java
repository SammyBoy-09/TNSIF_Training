package org.tnsif.acc.c2tc.interview_questions.interfacedemo;

interface Shape { 
    void draw(); 
}

class Circle implements Shape { 
    public void draw() { System.out.println("Drawing a Circle."); } 
}

class Rectangle implements Shape { 
    public void draw() { System.out.println("Drawing a Rectangle."); } 
}

public class InterfaceAsParameterDemo {
    
    // Method accepts ANY object whose class implements the Shape interface
    static void renderShape(Shape shape) {
        System.out.print("Rendering... ");
        shape.draw(); 
    }
    
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        Rectangle myRectangle = new Rectangle();
        
        // Passing different implementations to the same method
        renderShape(myCircle);
        renderShape(myRectangle);
    }
}
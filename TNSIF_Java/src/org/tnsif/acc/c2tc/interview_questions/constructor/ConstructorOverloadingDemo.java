package org.tnsif.acc.c2tc.interview_questions.constructor;

class Box {
    double width, height, depth;

    // Constructor 1: Used when no dimensions are specified (cube of size 1)
    Box() {
        width = height = depth = 1.0;
    }

    // Constructor 2: Used when one dimension is specified (a cube)
    Box(double len) {
        width = height = depth = len;
    }

    // Constructor 3: Used when all dimensions are specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    void calculateVolume() {
        System.out.println("Volume is: " + (width * height * depth));
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Box defaultBox = new Box();
        Box cube = new Box(5.0);
        Box customBox = new Box(2.0, 3.0, 4.0);

        defaultBox.calculateVolume();
        cube.calculateVolume();
        customBox.calculateVolume();
    }
}
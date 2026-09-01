package org.tnsif.acc.c2tc.interview_questions.inheritance_constructor_super;

class Grandparent {
    Grandparent() {
        System.out.println("1. Grandparent constructor executes first.");
    }
}

class ParentClass extends Grandparent {
    ParentClass() {
        System.out.println("2. Parent constructor executes second.");
    }
}

class ChildClass extends ParentClass {
    ChildClass() {
        System.out.println("3. Child constructor executes last.");
    }
}

public class ExecutionOrderDemo {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
    }
}
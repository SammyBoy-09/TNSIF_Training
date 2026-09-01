package org.tnsif.acc.c2tc.interview_questions.inheritance;

class Employee {
    String company = "TechCorp";
    void showCompany() {
        System.out.println("Working at " + company);
    }
}

class Developer extends Employee {
    void writeCode() {
        System.out.println("Developer is writing code.");
    }
}

class Designer extends Employee {
    void designUI() {
        System.out.println("Designer is creating UI mockups.");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.showCompany(); // Inherited from Employee
        dev.writeCode();
        
        Designer designer = new Designer();
        designer.showCompany(); // Inherited from Employee
        designer.designUI();
    }
}
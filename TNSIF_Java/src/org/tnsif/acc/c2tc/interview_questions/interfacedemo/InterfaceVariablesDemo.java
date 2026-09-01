package org.tnsif.acc.c2tc.interview_questions.interfacedemo;

interface DatabaseConfig {
    // Interface variables are implicitly public, static, and final
    String DB_URL = "jdbc:mysql://localhost:3306/mydb";
    int MAX_CONNECTIONS = 50;
}

public class InterfaceVariablesDemo {
    public static void main(String[] args) {
        // Accessed directly via the interface name without instantiation
        System.out.println("Database URL: " + DatabaseConfig.DB_URL);
        System.out.println("Max Connections: " + DatabaseConfig.MAX_CONNECTIONS);
    }
}
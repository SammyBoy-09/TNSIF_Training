package org.tnsif.acc.c2tc.interview_questions.constructor;

class DatabaseConnection {
    // Static variable to hold the single instance
    private static DatabaseConnection instance;

    // Private constructor prevents instantiation from outside
    private DatabaseConnection() {
        System.out.println("Database connection established.");
    }

    // Public static method to provide access to the instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}

public class PrivateConstructorDemo {
    public static void main(String[] args) {
        // DatabaseConnection db = new DatabaseConnection(); // This would cause a compile error
        
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        
        // Both references point to the exact same object in memory
        System.out.println("Are both instances the same? " + (db1 == db2));
    }
}

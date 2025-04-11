package Connections;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnectionTest {
    public static void main(String[] args) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            if (conn != null) {
                System.out.println("Connection to SQLite has been established successfully!");

                // Test query to verify the database
                String testQuery = "SELECT name FROM sqlite_master WHERE type='table';";
                try (Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery(testQuery)) {

                    System.out.println("Tables in the database:");
                    while (rs.next()) {
                        System.out.println("- " + rs.getString("name"));
                    }
                }
            } else {
                System.out.println("Failed to establish a connection.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

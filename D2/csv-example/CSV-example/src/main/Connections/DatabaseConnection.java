package Connections;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() throws SQLException {
        // Use the correct path to locate the database file
        String dbPath = "C:/Users/kamil/Downloads/D2/D2/csv-example/CSV-example/src/Resources/parkingsystem.db";
        File dbFile = new File(dbPath);

        System.out.println("Checking database file at: " + dbFile.getAbsolutePath());
 
        if (!dbFile.exists()) {
            throw new SQLException("Database file not found at: " + dbPath);
        }

        String url = "jdbc:sqlite:" + dbFile.getAbsolutePath();
        return DriverManager.getConnection(url);
    }
}
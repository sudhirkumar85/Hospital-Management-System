package cws.DBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sudhir Kushwaha
 */
public class DBConnection {

    public static Connection getDBConnection() {

        try {
            // Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/HospitalManagementStstem"; // Corrected the database name and added localhost:3306
            String username = "root"; // Database Username
            String password = "1234"; // Database Password

            // Establish Connection
            Connection connection = DriverManager.getConnection(url, username, password);
            // Return Connection Object
            return connection;
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Database driver not found: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to the database: " + e.getMessage());
        }

        return null;
    }
}

package CURD_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateDB {

    public static void main(String[] args) {

        // MySQL database details
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "Abhishek@21012007";

        try {

            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection with MySQL
            Connection con = DriverManager.getConnection(url, user, password);

            System.out.println("Connected to MySQL Database!");

            // Create Statement object
            Statement stmt = con.createStatement();

            // Execute SELECT query
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            // Display student records
            System.out.println("\nStudent Details:");

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");

                System.out.println(id + " " + name + " " + marks);
            }

            // Close connection
            con.close();

            System.out.println("\nConnection closed.");

        } catch (Exception e) {

            System.out.println("Error: " + e);
        }
    }
}
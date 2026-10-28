package Assignment_19;

import java.sql.*;   // Import JDBC classes

public class As {

    public static void main(String[] args) {

        // Database URL
        // "college" is the name of the MySQL database
        String url = "jdbc:mysql://localhost:3306/college";

        // MySQL username
        String username = "root";

        // MySQL password
        String password = "root";

        try {

            // Establish connection with the database
            Connection con = DriverManager.getConnection(
                    url, username, password
            );

            System.out.println("Database connected successfully.\n");

            // SQL SELECT query to retrieve all student records
            String query = "SELECT * FROM student";

            // Create Statement object to execute the SQL query
            Statement stmt = con.createStatement();

            // Execute SELECT query
            // ResultSet stores the records returned by the database
            ResultSet rs = stmt.executeQuery(query);

            // Display heading
            System.out.println("Student Records:");
            System.out.println("-----------------------------");

            // rs.next() moves to the next row
            // Loop continues until all records are displayed
            while (rs.next()) {

                // Get values from the respective columns
                int rollNo = rs.getInt("roll_no");
                String name = rs.getString("name");
                String course = rs.getString("course");
                double marks = rs.getDouble("marks");

                // Display the student details
                System.out.println(
                        rollNo + " | " +
                        name + " | " +
                        course + " | " +
                        marks
                );
            }

            // Close ResultSet
            rs.close();

            // Close Statement
            stmt.close();

            // Close database connection
            con.close();

            System.out.println("\nDatabase connection closed.");

        } catch (SQLException e) {

            // Display database error
            System.out.println("Database Error: " + e.getMessage());
        }
    }
}
/*
 CREATE DATABASE college;

USE college;

CREATE TABLE student (
    roll_no INT PRIMARY KEY,
    name VARCHAR(50),
    course VARCHAR(50),
    marks DOUBLE
);

INSERT INTO student VALUES
(101, 'Abhishek', 'CSE', 85.5),
(102, 'Rahul', 'CSE', 78.0),
(103, 'Priya', 'IT', 91.5);
*/
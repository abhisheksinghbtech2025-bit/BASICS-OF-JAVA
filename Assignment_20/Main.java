package Assignment_20;

import java.sql.*;   // Import JDBC classes required for database connectivity

public class Main {

    // Database URL: college is the name of our MySQL database
    static final String URL = "jdbc:mysql://localhost:3306/studentdb";

    // MySQL username
    static final String USER = "root";

    // MySQL password
    static final String PASSWORD = "Abhishek@21012007";

    public static void main(String[] args) {

        try {

            // --------------------------------------------------
            // 1. ESTABLISH DATABASE CONNECTION
            // --------------------------------------------------

            // DriverManager creates a connection with the MySQL database
            Connection con = DriverManager.getConnection(
                    URL, USER, PASSWORD
            );

            System.out.println("Database connected successfully.");


            // --------------------------------------------------
            // 2. CREATE / INSERT OPERATION
            // --------------------------------------------------

            // SQL query to insert a new student record
            // ? represents values that will be provided later
            String insertQuery =
                    "INSERT INTO student VALUES (?, ?, ?, ?)";

            // PreparedStatement is used to execute the parameterized query
            PreparedStatement ps1 =
                    con.prepareStatement(insertQuery);

            // Set roll number at first ? 
            ps1.setInt(1, 101);

            // Set student name at second ?
            ps1.setString(2, "Abhishek");

            // Set course at third ?
            ps1.setString(3, "CSE");

            // Set marks at fourth ?
            ps1.setDouble(4, 85.5);

            // executeUpdate() executes INSERT query
            ps1.executeUpdate();

            System.out.println("Student inserted successfully.");


            // --------------------------------------------------
            // 3. READ OPERATION
            // --------------------------------------------------

            // SQL query to retrieve all student records
            String selectQuery = "SELECT * FROM student";

            // Create Statement object to execute the SELECT query
            Statement st = con.createStatement();

            // executeQuery() executes SELECT query
            // ResultSet stores the records returned by the database
            ResultSet rs = st.executeQuery(selectQuery);

            System.out.println("\nStudent Records:");

            // rs.next() moves to the next row of the result
            // The loop continues until there are no more rows
            while (rs.next()) {

                // Get and display values from each column
                System.out.println(
                        rs.getInt("roll_no") + " " +
                        rs.getString("name") + " " +
                        rs.getString("course") + " " +
                        rs.getDouble("marks")
                );
            }


            // --------------------------------------------------
            // 4. UPDATE OPERATION
            // --------------------------------------------------

            // SQL query to change the marks of a student
            // WHERE roll_no = ? identifies which student to update
            String updateQuery =
                    "UPDATE student SET marks = ? WHERE roll_no = ?";

            // Create PreparedStatement for UPDATE query
            PreparedStatement ps2 =
                    con.prepareStatement(updateQuery);

            // Set new marks
            ps2.setDouble(1, 90.0);

            // Set roll number of the student whose marks should change
            ps2.setInt(2, 101);

            // Execute UPDATE query
            ps2.executeUpdate();

            System.out.println("\nStudent updated successfully.");


            // --------------------------------------------------
            // 5. DELETE OPERATION
            // --------------------------------------------------

            // SQL query to delete a student
            // The WHERE condition identifies the student
            String deleteQuery =
                    "DELETE FROM student WHERE roll_no = ?";

            // Create PreparedStatement for DELETE query
            PreparedStatement ps3 =
                    con.prepareStatement(deleteQuery);

            // Set roll number of the student to be deleted
            ps3.setInt(1, 101);

            // Execute DELETE query
            ps3.executeUpdate();

            System.out.println("Student deleted successfully.");


            // --------------------------------------------------
            // 6. CLOSE DATABASE CONNECTION
            // --------------------------------------------------

            // Close the connection after all operations are completed
            con.close();

            System.out.println("Database connection closed.");

        }

        // SQLException handles errors related to the database
        catch (SQLException e) {

            // Display the error message if something goes wrong
            System.out.println("Database Error: " + e.getMessage());
        }
    }
}

/*-- Create a database named college
CREATE DATABASE college;

-- Select the college database
USE college;

-- Create the student table
CREATE TABLE student (
    roll_no INT PRIMARY KEY,
    name VARCHAR(50),
    course VARCHAR(50),
    marks DOUBLE
);*/
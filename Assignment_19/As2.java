package Assignment_19;

import java.sql.*;   // Import JDBC classes

public class As {

    public static void main(String[] args) {

        // Database URL
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

            // SELECT query to retrieve product details
            String query =
                    "SELECT product_id, product_name, quantity, price FROM product";

            // Create Statement object
            Statement stmt = con.createStatement();

            // Execute SELECT query
            ResultSet rs = stmt.executeQuery(query);

            // Display heading
            System.out.println("Product Records:");
            System.out.println("----------------------------------");

            // Read each row from ResultSet
            while (rs.next()) {

                // Get product ID
                int productId = rs.getInt("product_id");

                // Get product name
                String productName = rs.getString("product_name");

                // Get quantity
                int quantity = rs.getInt("quantity");

                // Get price
                double price = rs.getDouble("price");

                // Display product details
                System.out.println(
                        productId + " | " +
                        productName + " | " +
                        quantity + " | " +
                        price
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
 USE college;

CREATE TABLE product (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(50),
    quantity INT,
    price DOUBLE
);

INSERT INTO product VALUES
(1, 'Laptop', 10, 55000),
(2, 'Mouse', 25, 800),
(3, 'Keyboard', 15, 1500);
*/
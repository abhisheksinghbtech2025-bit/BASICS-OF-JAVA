package Assignment_14;

import java.util.Scanner;

public class OnlineShopping {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take product quantity from user
        System.out.print("Enter product quantity: ");
        int quantity = sc.nextInt();

        try {

            // Check whether quantity is valid
            if (quantity <= 0) {

                // Generate an exception for invalid quantity
                throw new Exception("Product quantity must be greater than zero.");
            }

            // Display message for valid quantity
            System.out.println("Product quantity accepted.");
            System.out.println("Quantity: " + quantity);

        } catch (Exception e) {

            // Handle the exception
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
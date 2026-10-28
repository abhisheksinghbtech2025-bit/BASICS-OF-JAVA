package Assignment_14;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take withdrawal amount from user
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {

            // Check whether withdrawal amount is valid
            if (amount <= 0) {

                // Generate an exception for invalid amount
                throw new Exception("Invalid withdrawal amount!");
            }

            // Display message for valid amount
            System.out.println("Withdrawal successful.");
            System.out.println("Amount withdrawn: " + amount);

        } catch (Exception e) {

            // Handle the exception
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
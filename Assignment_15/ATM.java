package Assignment_15;

import java.util.Scanner;

public class ATM {

    // Method uses 'throws' to declare that it may throw an exception
    static void verifyPIN(int pin) throws Exception {

        // Check whether PIN is invalid
        if (pin != 1234) {

            // 'throw' explicitly generates an exception
            throw new Exception("Invalid PIN!");
        }

        // Display message if PIN is correct
        System.out.println("PIN verified successfully.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user to enter PIN
        System.out.print("Enter ATM PIN: ");
        int pin = sc.nextInt();

        try {

            // Call the PIN verification method
            verifyPIN(pin);

        } catch (Exception e) {

            // Handle the exception
            System.out.println("Exception: " + e.getMessage());

        } finally {

            // finally always executes
            System.out.println("PIN verification process completed.");
        }

        sc.close();
    }
}
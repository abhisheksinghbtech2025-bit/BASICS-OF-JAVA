package Assignment_15;

import java.util.Scanner;

public class Login {

    // Method uses 'throws' to declare that it may throw an exception
    static void checkPassword(String password) throws Exception {

        // Check whether password is invalid
        if (!password.equals("admin123")) {

            // 'throw' is used to explicitly create an exception
            throw new Exception("Invalid Password!");
        }

        // Display message if password is correct
        System.out.println("Login Successful!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user to enter password
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        try {

            // Call the method that may throw an exception
            checkPassword(password);

        } catch (Exception e) {

            // Handle the exception
            System.out.println("Exception: " + e.getMessage());

        } finally {

            // finally always executes
            System.out.println("Login process completed.");
        }

        sc.close();
    }
}
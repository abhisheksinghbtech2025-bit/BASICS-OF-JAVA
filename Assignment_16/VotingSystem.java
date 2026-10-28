package Assignment_16;

import java.util.Scanner;

// User-defined exception
class InvalidAgeException extends Exception {

    // Constructor to display custom error message
    InvalidAgeException(String message) {
        super(message);
    }
}

public class VotingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take age from user
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {

            // Check whether age is below 18
            if (age < 18) {

                // Throw user-defined exception
                throw new InvalidAgeException(
                        "You are not eligible for voting."
                );
            }

            // If age is 18 or above
            System.out.println("You are eligible for voting.");

        } catch (InvalidAgeException e) {

            // Handle the custom exception
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
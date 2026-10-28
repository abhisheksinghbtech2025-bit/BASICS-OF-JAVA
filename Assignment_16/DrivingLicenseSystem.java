package Assignment_16;

import java.util.Scanner;

// User-defined exception
class InvalidDrivingAgeException extends Exception {

    // Constructor to display custom error message
    InvalidDrivingAgeException(String message) {
        super(message);
    }
}

public class DrivingLicenseSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take age from user
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {

            // Check whether age is below 18
            if (age < 18) {

                // Throw user-defined exception
                throw new InvalidDrivingAgeException(
                        "You are not eligible for a driving license."
                );
            }

            // If age is 18 or above
            System.out.println(
                    "You are eligible for a driving license."
            );

        } catch (InvalidDrivingAgeException e) {

            // Handle the custom exception
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
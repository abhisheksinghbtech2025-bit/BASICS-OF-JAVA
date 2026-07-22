/*
 * Assignment No: 8
 * Program 2: Vehicle Insurance System using super Keyword
 *
 * Aim:
 * To demonstrate the use of super keyword
 * in inheritance.
 */

// Parent Class
class Vehicle {

    // Common vehicle details
    String vehicleNumber;
    String ownerName;

    // Parameterized constructor
    Vehicle(String vehicleNumber, String ownerName) {

        // Initialize parent class variables
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    // Method to display vehicle details
    void displayVehicleDetails() {

        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Owner Name     : " + ownerName);
    }
}

// Child Class
class Insurance extends Vehicle {

    // Child class variable
    double insuranceAmount;

    // Parameterized constructor
    Insurance(String vehicleNumber, String ownerName, double insuranceAmount) {

        /*
         * Calling parent constructor
         * using super keyword.
         */
        super(vehicleNumber, ownerName);

        // Initialize child class variable
        this.insuranceAmount = insuranceAmount;
    }

    // Method to display insurance details
    void displayInsuranceDetails() {

        /*
         * Calling parent class method
         * using super keyword.
         */
        super.displayVehicleDetails();

        System.out.println("Insurance Amount : ₹" + insuranceAmount);
    }
}

// Main Class
public class VehicleInsuranceDemo {

    public static void main(String[] args) {

        // Creating Insurance object
        Insurance insurance = new Insurance(
                "MH12AB1234",
                "Abhishek Singh",
                500000
        );

        System.out.println("------ Vehicle Insurance Details ------");

        // Display insurance details
        insurance.displayInsuranceDetails();
    }
}
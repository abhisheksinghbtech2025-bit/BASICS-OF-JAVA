/*
 * Assignment No: 6
 * Program 1: Vehicle Program using Inner Class and Anonymous Class
 *
 * Aim:
 * To demonstrate the use of an Inner Class and
 * an Anonymous Class in Java.
 */

// Interface for performing vehicle action
interface VehicleAction {

    // Abstract method
    void startVehicle();
}

// Outer Class
class Vehicle {

    // Data members of Vehicle class
    private String vehicleName;
    private String vehicleNumber;

    // Parameterized constructor
    Vehicle(String vehicleName, String vehicleNumber) {
        this.vehicleName = vehicleName;
        this.vehicleNumber = vehicleNumber;
    }

    /*
     * Inner Class
     * This class can directly access the private
     * members of the outer class.
     */
    class VehicleDetails {

        // Method to display vehicle information
        void displayDetails() {

            System.out.println("\n------ Vehicle Details ------");
            System.out.println("Vehicle Name   : " + vehicleName);
            System.out.println("Vehicle Number : " + vehicleNumber);
        }
    }
}

// Main Class
public class VehicleDemo {

    public static void main(String[] args) {

        // Creating object of outer class
        Vehicle vehicle = new Vehicle("Honda City", "MH12AB1234");

        // Creating object of inner class
        Vehicle.VehicleDetails details = vehicle.new VehicleDetails();

        // Display vehicle details
        details.displayDetails();

        /*
         * Anonymous Class
         * Implements VehicleAction interface
         * without creating a separate class.
         */
        VehicleAction action = new VehicleAction() {

            // Overriding interface method
            public void startVehicle() {

                System.out.println("\nVehicle Started Successfully.");
            }
        };

        // Calling anonymous class method
        action.startVehicle();
    }
}
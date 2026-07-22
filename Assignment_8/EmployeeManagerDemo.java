/*
 * Assignment No: 8
 * Program 1: Employee and Manager using super Keyword
 *
 * Aim:
 * To demonstrate the use of the super keyword
 * for accessing parent class members.
 */

// Parent Class
class Employee {

    // Data members
    String name;
    double salary;

    // Parameterized Constructor
    Employee(String name, double salary) {

        // Initialize parent class variables
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void displayEmployee() {

        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : ₹" + salary);
    }
}

// Child Class
class Manager extends Employee {

    // Additional data member
    String department;

    // Parameterized Constructor
    Manager(String name, double salary, String department) {

        /*
         * super() is used to call
         * the parent class constructor.
         */
        super(name, salary);

        // Initialize child class variable
        this.department = department;
    }

    // Display complete manager details
    void displayManager() {

        /*
         * Calling parent class method
         * using super keyword.
         */
        super.displayEmployee();

        System.out.println("Department    : " + department);
    }
}

// Main Class
public class EmployeeManagerDemo {

    public static void main(String[] args) {

        // Creating Manager object
        Manager manager = new Manager("Abhishek Singh", 85000, "Information Technology");

        System.out.println("------ Manager Details ------");

        // Display manager information
        manager.displayManager();
    }
}
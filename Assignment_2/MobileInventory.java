package Assignment_2;

/*
 * Assignment No: 2
 * Program 2: Mobile Phone Inventory System
 *
 * Aim:
 * To demonstrate the use of default,
 * parameterized and copy constructors.
 */

// Mobile Class
class Mobile {

    // Data members
    String brand;
    String model;
    double price;

    // Default Constructor
    Mobile() {
        brand = "Unknown";
        model = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Copy Constructor
    Mobile(Mobile obj) {
        this.brand = obj.brand;
        this.model = obj.model;
        this.price = obj.price;
    }

    // Display Method
    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : ₹" + price);
    }
}

// Main Class
public class MobileInventory {

    public static void main(String[] args) {

        System.out.println("------ Default Constructor ------");

        Mobile m1 = new Mobile();
        m1.display();

        System.out.println();

        System.out.println("------ Parameterized Constructor ------");

        Mobile m2 = new Mobile("Samsung", "Galaxy S25", 79999);

        m2.display();

        System.out.println();

        System.out.println("------ Copy Constructor ------");

        Mobile m3 = new Mobile(m2);

        m3.display();
    }
}
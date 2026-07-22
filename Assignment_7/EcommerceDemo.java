/*
 * Assignment No: 7
 * Program 2: E-Commerce Product System
 *
 * Aim:
 * To demonstrate Inheritance and Interfaces
 * using an E-Commerce Product System.
 */

// Interface
interface Product {

    // Abstract method
    void displayProductDetails();
}

// Parent Class
class ProductDetails {

    // Common data members
    int productId;
    String productName;
    double price;

    // Constructor
    ProductDetails(int productId, String productName, double price) {

        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Common method
    void showBasicDetails() {

        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
    }
}

// Child Class Electronic
class Electronic extends ProductDetails implements Product {

    String brand;

    Electronic(int id, String name, double price, String brand) {

        super(id, name, price);

        this.brand = brand;
    }

    @Override
    public void displayProductDetails() {

        System.out.println("\n------ Electronic Product ------");

        showBasicDetails();

        System.out.println("Brand        : " + brand);
    }
}

// Child Class Clothing
class Clothing extends ProductDetails implements Product {

    String size;

    Clothing(int id, String name, double price, String size) {

        super(id, name, price);

        this.size = size;
    }

    @Override
    public void displayProductDetails() {

        System.out.println("\n------ Clothing Product ------");

        showBasicDetails();

        System.out.println("Size         : " + size);
    }
}

// Child Class Grocery
class Grocery extends ProductDetails implements Product {

    double weight;

    Grocery(int id, String name, double price, double weight) {

        super(id, name, price);

        this.weight = weight;
    }

    @Override
    public void displayProductDetails() {

        System.out.println("\n------ Grocery Product ------");

        showBasicDetails();

        System.out.println("Weight       : " + weight + " Kg");
    }
}

// Main Class
public class EcommerceDemo {

    public static void main(String[] args) {

        // Creating Electronic product
        Electronic e = new Electronic(101, "Laptop", 65000, "Dell");

        // Creating Clothing product
        Clothing c = new Clothing(102, "T-Shirt", 899, "Large");

        // Creating Grocery product
        Grocery g = new Grocery(103, "Rice Bag", 1200, 10);

        // Display product details
        e.displayProductDetails();

        c.displayProductDetails();

        g.displayProductDetails();
    }
}
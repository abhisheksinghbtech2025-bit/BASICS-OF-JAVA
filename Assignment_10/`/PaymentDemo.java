/*
 * Assignment No: 10
 * Program 1: Payment System using Abstract Class
 *
 * Aim:
 * To demonstrate the use of an abstract class
 * and abstract methods in Java.
 */

// Abstract Class
abstract class Payment {

    // Common data member
    double amount;

    // Constructor
    Payment(double amount) {
        this.amount = amount;
    }

    /*
     * Abstract method.
     * Every subclass must provide its own implementation.
     */
    abstract void makePayment();

    // Concrete method
    void showAmount() {
        System.out.println("Payment Amount : ₹" + amount);
    }
}

// Credit Card Class
class CreditCardPayment extends Payment {

    // Constructor
    CreditCardPayment(double amount) {
        super(amount);
    }

    // Implement abstract method
    @Override
    void makePayment() {

        showAmount();

        System.out.println("Payment Mode   : Credit Card");
        System.out.println("Status         : Payment Successful");
    }
}

// UPI Payment Class
class UPIPayment extends Payment {

    // Constructor
    UPIPayment(double amount) {
        super(amount);
    }

    // Implement abstract method
    @Override
    void makePayment() {

        showAmount();

        System.out.println("Payment Mode   : UPI");
        System.out.println("Status         : Payment Successful");
    }
}

// Main Class
public class PaymentDemo {

    public static void main(String[] args) {

        System.out.println("------ Credit Card Payment ------");

        // Parent reference pointing to child object
        Payment payment1 = new CreditCardPayment(2500);

        payment1.makePayment();

        System.out.println();

        System.out.println("------ UPI Payment ------");

        // Parent reference pointing to another child object
        Payment payment2 = new UPIPayment(1200);

        payment2.makePayment();
    }
}
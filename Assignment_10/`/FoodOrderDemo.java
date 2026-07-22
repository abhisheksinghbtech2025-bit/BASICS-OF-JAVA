/*
 * Assignment No: 10
 * Program 2: Food Order System using Abstract Class
 *
 * Aim:
 * To demonstrate abstraction using abstract classes
 * and abstract methods.
 */

// Abstract Class
abstract class FoodOrder {

    // Data member
    double foodAmount;

    // Constructor
    FoodOrder(double foodAmount) {
        this.foodAmount = foodAmount;
    }

    /*
     * Abstract Method
     * Must be implemented by all subclasses.
     */
    abstract void calculateBill();

    // Common method
    void displayAmount() {
        System.out.println("Food Amount : ₹" + foodAmount);
    }
}

// Dine-In Order Class
class DineInOrder extends FoodOrder {

    // Constructor
    DineInOrder(double foodAmount) {
        super(foodAmount);
    }

    // Implement abstract method
    @Override
    void calculateBill() {

        double gst = foodAmount * 0.05;

        double total = foodAmount + gst;

        displayAmount();

        System.out.println("GST (5%)     : ₹" + gst);
        System.out.println("Order Type   : Dine-In");
        System.out.println("Total Bill   : ₹" + total);
    }
}

// Takeaway Order Class
class TakeAwayOrder extends FoodOrder {

    // Packing charge
    double packingCharge = 30;

    // Constructor
    TakeAwayOrder(double foodAmount) {
        super(foodAmount);
    }

    // Implement abstract method
    @Override
    void calculateBill() {

        double gst = foodAmount * 0.05;

        double total = foodAmount + gst + packingCharge;

        displayAmount();

        System.out.println("GST (5%)         : ₹" + gst);
        System.out.println("Packing Charge   : ₹" + packingCharge);
        System.out.println("Order Type       : Takeaway");
        System.out.println("Total Bill       : ₹" + total);
    }
}

// Main Class
public class FoodOrderDemo {

    public static void main(String[] args) {

        System.out.println("------ Dine-In Order ------");

        FoodOrder order1 = new DineInOrder(800);

        order1.calculateBill();

        System.out.println();

        System.out.println("------ Takeaway Order ------");

        FoodOrder order2 = new TakeAwayOrder(800);

        order2.calculateBill();
    }
}
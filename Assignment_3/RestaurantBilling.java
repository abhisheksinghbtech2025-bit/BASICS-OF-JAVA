/* * Assignment No: 3
 * Program 2: Restaurant Billing Application
 *
 * Aim:
 * To demonstrate method overloading and the use
 * of static variables and methods.
 */ 


class Restaurant {

    // Static variable to count total orders
    static int totalOrders = 0;

    // Dine-in bill
    double calculateBill(double foodAmount) {
        totalOrders++;

        double gst = foodAmount * 0.05;
        return foodAmount + gst;
    }

    // Takeaway bill
    double calculateBill(double foodAmount, double packingCharge) {
        totalOrders++;

        double gst = foodAmount * 0.05;
        return foodAmount + packingCharge + gst;
    }

    // Delivery bill
    double calculateBill(double foodAmount, double packingCharge, double deliveryCharge) {
        totalOrders++;

        double gst = foodAmount * 0.05;
        return foodAmount + packingCharge + deliveryCharge + gst;
    }

    // Static method
    static void displayTotalOrders() {
        System.out.println("\nTotal Orders Processed = " + totalOrders);
    }
}

public class RestaurantBilling {

    public static void main(String[] args) {

        Restaurant bill = new Restaurant();

        // Dine-in Order
        double dineIn = bill.calculateBill(500);

        // Takeaway Order
        double takeaway = bill.calculateBill(500, 30);

        // Delivery Order
        double delivery = bill.calculateBill(500, 30, 50);

        System.out.println("Dine-In Bill      : ₹" + dineIn);

        System.out.println("Takeaway Bill     : ₹" + takeaway);

        System.out.println("Delivery Bill     : ₹" + delivery);

        Restaurant.displayTotalOrders();
    }
}
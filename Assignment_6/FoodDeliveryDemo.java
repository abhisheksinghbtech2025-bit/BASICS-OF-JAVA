/*
 * Assignment No: 6
 * Program 2: Food Delivery Application
 *
 * Aim:
 * To demonstrate the use of an Inner Class
 * and an Anonymous Class in Java.
 */

// Interface for delivery status
interface DeliveryStatus {

    // Abstract method
    void updateStatus();
}

// Outer Class
class FoodOrder {

    // Data members
    private int orderId;
    private String customerName;
    private String foodItem;

    // Parameterized constructor
    FoodOrder(int orderId, String customerName, String foodItem) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.foodItem = foodItem;
    }

    /*
     * Inner Class
     * Displays complete order details.
     */
    class OrderDetails {

        // Method to display order information
        void displayOrder() {

            System.out.println("\n------ Order Details ------");
            System.out.println("Order ID      : " + orderId);
            System.out.println("Customer Name : " + customerName);
            System.out.println("Food Item     : " + foodItem);
        }
    }
}

// Main Class
public class FoodDeliveryDemo {

    public static void main(String[] args) {

        // Creating FoodOrder object
        FoodOrder order = new FoodOrder(101, "Abhishek Singh", "Veg Biryani");

        // Creating object of Inner Class
        FoodOrder.OrderDetails details = order.new OrderDetails();

        // Display order details
        details.displayOrder();

        /*
         * Anonymous Class
         * Used for updating delivery status
         * without creating another class.
         */
        DeliveryStatus status = new DeliveryStatus() {

            // Overriding updateStatus() method
            @Override
            public void updateStatus() {

                System.out.println("\nDelivery Status : Order Delivered Successfully.");
            }
        };

        // Calling anonymous class method
        status.updateStatus();
    }
}
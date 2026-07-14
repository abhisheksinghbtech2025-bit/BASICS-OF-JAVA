// WrapperClassDemo.java

public class WrapperClassDemo {
    public static void main(String[] args) {

        // Primitive data type
        int num = 50;

        // Autoboxing (primitive to object)
        Integer obj = num;
        System.out.println("Autoboxing:");
        System.out.println("Primitive value: " + num);
        System.out.println("Wrapper object: " + obj);

        // Unboxing (object to primitive)
        int value = obj;
        System.out.println("\nUnboxing:");
        System.out.println("Primitive value after unboxing: " + value);

        // Performing operations on wrapped values
        Integer a = 20;
        Integer b = 30;

        int sum = a + b;          // Automatic unboxing
        int product = a * b;

        System.out.println("\nOperations on Wrapper Objects:");
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);

        // Converting String to Integer
        String str = "100";
        Integer number = Integer.parseInt(str);
        System.out.println("\nString to Integer:");
        System.out.println("Converted value = " + number);

        // Converting Integer to String
        String str2 = Integer.toString(number);
        System.out.println("\nInteger to String:");
        System.out.println("Converted String = " + str2);
    }
}
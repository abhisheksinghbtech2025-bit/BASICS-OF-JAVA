
/*
 * Assignment No: 3
 * Program 1: Calculator using Method Overloading and Static Variable
 *
 * Aim:
 * To demonstrate method overloading and the use of static variables
 * and static methods in Java.
 */
package Assignment_3;
class Calculator {

    // Static variable to count total calculations
    static int calculationCount = 0;

    // Method to add two integers
    int add(int a, int b) {
        calculationCount++;
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        calculationCount++;
        return a + b + c;
    }

    // Overloaded method to add two double values
    double add(double a, double b) {
        calculationCount++;
        return a + b;
    }

    // Static method to display total calculations
    static void showCalculationCount() {
        System.out.println("\nTotal Calculations Performed = " + calculationCount);
    }
}

public class CalculatorDemo {

    public static void main(String[] args) {

        // Creating Calculator object
        Calculator calc = new Calculator();

        // Calling overloaded methods
        System.out.println("Addition of Two Integers: " + calc.add(20, 30));

        System.out.println("Addition of Three Integers: " + calc.add(10, 20, 30));

        System.out.println("Addition of Two Decimal Numbers: " + calc.add(12.5, 8.75));

        // Calling static method
        Calculator.showCalculationCount();
    }
}
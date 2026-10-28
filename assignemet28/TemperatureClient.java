
import java.rmi.Naming;
import java.util.Scanner;

public class TemperatureClient {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            TemperatureConverter tc =
                (TemperatureConverter) Naming.lookup(
                    "rmi://localhost/TemperatureService");

            System.out.println("Temperature Conversion");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Celsius: ");
                double c = sc.nextDouble();

                System.out.printf(
                    "Fahrenheit: %.2f%n",
                    tc.celsiusToFahrenheit(c));
            } else if (choice == 2) {
                System.out.print("Enter Fahrenheit: ");
                double f = sc.nextDouble();

                System.out.printf(
                    "Celsius: %.2f%n",
                    tc.fahrenheitToCelsius(f));
            } else {
                System.out.println("Invalid choice");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

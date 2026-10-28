package Assignment_4;

/*
 * Assignment No: 4
 * Program 2: Employee Payroll System
 *
 * Aim:
 * To demonstrate the use of Wrapper Classes
 * for conversion and validation.
 */

import java.util.Scanner;

public class EmployeePayroll {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept input as String
        System.out.print("Enter Employee ID : ");
        String empIdStr = sc.nextLine();

        System.out.print("Enter Basic Salary : ");
        String salaryStr = sc.nextLine();

        System.out.print("Enter Bonus : ");
        String bonusStr = sc.nextLine();

        // Convert String into Wrapper Objects
        Integer empId = Integer.parseInt(empIdStr);
        Double basicSalary = Double.parseDouble(salaryStr);
        Double bonus = Double.parseDouble(bonusStr);

        // Validate salary and bonus
        if (basicSalary < 0 || bonus < 0) {

            System.out.println("\nInvalid Salary or Bonus Amount.");

        } else {

            double netSalary = basicSalary + bonus;

            System.out.println("\n===== EMPLOYEE PAYROLL =====");
            System.out.println("Employee ID  : " + empId);
            System.out.println("Basic Salary : ₹" + basicSalary);
            System.out.println("Bonus        : ₹" + bonus);
            System.out.println("----------------------------");
            System.out.println("Net Salary   : ₹" + netSalary);
        }

        sc.close();
    }
}
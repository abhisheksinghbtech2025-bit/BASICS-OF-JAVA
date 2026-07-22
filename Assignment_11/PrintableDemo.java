/*
 * Assignment No: 11
 * Program 1: Printable Interface
 *
 * Aim:
 * To demonstrate the implementation of
 * interfaces in Java.
 */

// Interface
interface Printable {

    /*
     * Abstract method.
     * Every class implementing this interface
     * must provide its own implementation.
     */
    void printDetails();
}

// Student Class implementing Printable Interface
class Student implements Printable {

    // Data members
    int rollNo;
    String name;
    String course;

    // Parameterized Constructor
    Student(int rollNo, String name, String course) {

        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    // Implementation of interface method
    @Override
    public void printDetails() {

        System.out.println("------ Student Details ------");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Course      : " + course);
    }
}

// Employee Class implementing Printable Interface
class Employee implements Printable {

    // Data members
    int empId;
    String name;
    String department;

    // Parameterized Constructor
    Employee(int empId, String name, String department) {

        this.empId = empId;
        this.name = name;
        this.department = department;
    }

    // Implementation of interface method
    @Override
    public void printDetails() {

        System.out.println("------ Employee Details ------");
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
    }
}

// Main Class
public class PrintableDemo {

    public static void main(String[] args) {

        // Creating Student object
        Printable student = new Student(
                101,
                "Abhishek Singh",
                "Computer Science Engineering"
        );

        // Creating Employee object
        Printable employee = new Employee(
                201,
                "Rahul Sharma",
                "Human Resources"
        );

        // Calling interface methods
        student.printDetails();

        System.out.println();

        employee.printDetails();
    }
}
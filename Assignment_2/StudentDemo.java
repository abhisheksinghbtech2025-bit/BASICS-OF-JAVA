package Assignment_2;

/*
 * Assignment No: 2
 * Program 1: Student Details using Constructors
 *
 * Aim:
 * To demonstrate the use of default and parameterized constructors.
 */

// Student class
class Student {

    // Data members
    String name;
    long rollNo; // Use long because PRN is very large

    // Default Constructor
    Student() {
        name = "Not Assigned";
        rollNo = 0;
    }

    // Parameterized Constructor
    Student(String name, long rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Display Method
    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
    }
}

// Main Class
public class StudentDemo {

    public static void main(String[] args) {

        System.out.println("------ Default Constructor ------");

        Student s1 = new Student();
        s1.display();

        System.out.println();

        System.out.println("------ Parameterized Constructor ------");

        Student s2 = new Student("Abhishek Singh", 25070122012L);
        s2.display();
    }
}
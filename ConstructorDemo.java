// ConstructorDemo.java

class Student {
    int id;
    String name;

    // Default Constructor
    Student() {
        id = 0;
        name = "Unknown";
    }

    // Parameterized Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy Constructor
    Student(Student s) {
        this.id = s.id;
        this.name = s.name;
    }

    // Method to display student details
    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println();
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {

        // Using Default Constructor
        Student s1 = new Student();
        System.out.println("Default Constructor:");
        s1.display();

        // Using Parameterized Constructor
        Student s2 = new Student(101, "Alice");
        System.out.println("Parameterized Constructor:");
        s2.display();

        // Using Copy Constructor
        Student s3 = new Student(s2);
        System.out.println("Copy Constructor:");
        s3.display();
    }
}
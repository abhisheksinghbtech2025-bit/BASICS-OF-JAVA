// Import Student class from student package
import student.Student;

// Import Faculty class from faculty package
import faculty.Faculty;

public class Main {

    public static void main(String[] args) {

        // Create object of Student class
        Student s = new Student();

        // Display student information
        s.displayStudent();

        System.out.println();

        // Create object of Faculty class
        Faculty f = new Faculty();

        // Display faculty information
        f.displayFaculty();
    }
}
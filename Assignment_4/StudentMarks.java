package Assignment_4;

/*
 * Assignment No: 4
 * Program 1: Student Marks using Wrapper Classes
 *
 * Aim:
 * To convert student marks from String format
 * to Integer and calculate total marks.
 */

public class StudentMarks {

    public static void main(String[] args) {

        // Marks stored as String
        String mark1 = "85";
        String   = "90";
        String mark3 = "78";

        // Convert String to Integer
        Integer m1 = Integer.parseInt(mark1);
        Integer m2 = Integer.parseInt(mark2);
        Integer m3 = Integer.parseInt(mark3);

        // Calculate total marks
        int total = m1 + m2 + m3;

        System.out.println("===== STUDENT MARKS =====");
        System.out.println("Subject 1 : " + m1);
        System.out.println("Subject 2 : " + m2);
        System.out.println("Subject 3 : " + m3);
        System.out.println("-------------------------");
        System.out.println("Total Marks : " + total);
    }
}
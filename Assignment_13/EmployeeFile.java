package Assignment_13;

import java.io.*;

public class EmployeeFile {

    public static void main(String[] args) {

        // File name where employee details will be stored
        String fileName = "employee.txt";

        // try block is used because file operations may cause exceptions
        try {

            // ---------------- WRITING TO FILE ----------------

            // FileWriter is used to write data into the file
            FileWriter fw = new FileWriter(fileName);

            // BufferedWriter makes writing to the file more efficient
            BufferedWriter bw = new BufferedWriter(fw);

            // Writing employee details into the file
            bw.write("Employee ID: 101");
            bw.newLine();

            bw.write("Name: Abhishek");
            bw.newLine();

            bw.write("Department: Computer Science");
            bw.newLine();

            bw.write("Salary: 50000");
            bw.newLine();

            // Close the writer after writing
            bw.close();

            System.out.println("Employee details written successfully.");

            // ---------------- READING FROM FILE ----------------

            // FileReader is used to read data from the file
            FileReader fr = new FileReader(fileName);

            // BufferedReader reads the file line by line
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("\nEmployee Details:");
            System.out.println("-------------------------");

            // Read each line until the end of the file
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader
            br.close();

        } catch (IOException e) {

            // Display error if any file operation fails
            System.out.println("File Error: " + e.getMessage());
        }
    }
}
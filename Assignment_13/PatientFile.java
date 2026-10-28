package Assignment_13;

import java.io.*;

public class PatientFile {

    public static void main(String[] args) {

        // File name where patient details will be stored
        String fileName = "patient.txt";

        try {

            // ---------------- WRITING TO FILE ----------------

            // Create FileWriter to write data into the file
            FileWriter fw = new FileWriter(fileName);

            // Create BufferedWriter for efficient writing
            BufferedWriter bw = new BufferedWriter(fw);

            // Write patient details into the file
            bw.write("Patient ID: 201");
            bw.newLine();

            bw.write("Name: Rahul");
            bw.newLine();

            bw.write("Age: 35");
            bw.newLine();

            bw.write("Diagnosis: Fever");
            bw.newLine();

            // Close the writer
            bw.close();

            System.out.println("Patient details written successfully.");

            // ---------------- READING FROM FILE ----------------

            // Create FileReader to read the file
            FileReader fr = new FileReader(fileName);

            // Create BufferedReader to read line by line
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("\nPatient Details:");
            System.out.println("-------------------------");

            // Read the file until there are no more lines
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader
            br.close();

        } catch (IOException e) {

            // Handle file-related errors
            System.out.println("File Error: " + e.getMessage());
        }
    }
}
package Assignment_17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends JFrame implements ActionListener {

    // Create text fields for student details
    JTextField nameField, rollField, courseField;

    // Create button
    JButton submitButton;

    StudentRegistration() {

        // Set title of the window
        setTitle("Student Registration Form");

        // Set size of the window
        setSize(400, 300);

        // Close program when window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout
        setLayout(new FlowLayout());

        // Create text fields
        nameField = new JTextField(20);
        rollField = new JTextField(20);
        courseField = new JTextField(20);

        // Create submit button
        submitButton = new JButton("Register");

        // Add labels and text fields
        add(new JLabel("Student Name:"));
        add(nameField);

        add(new JLabel("Roll Number:"));
        add(rollField);

        add(new JLabel("Course:"));
        add(courseField);

        // Add button
        add(submitButton);

        // Register button with ActionListener
        submitButton.addActionListener(this);

        // Display window
        setVisible(true);
    }

    // This method executes when the button is clicked
    public void actionPerformed(ActionEvent e) {

        // Get entered student details
        String name = nameField.getText();
        String roll = rollField.getText();
        String course = courseField.getText();

        // Display details in a dialog box
        JOptionPane.showMessageDialog(
                this,
                "Student Registered Successfully!\n"
                + "Name: " + name + "\n"
                + "Roll Number: " + roll + "\n"
                + "Course: " + course
        );
    }

    public static void main(String[] args) {

        // Create Student Registration Form
        new StudentRegistration();
    }
}
package Assignment_17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmployeeRegistration extends JFrame implements ActionListener {

    // Create text fields for employee details
    JTextField idField, nameField, departmentField, salaryField;

    // Create submit button
    JButton submitButton;

    EmployeeRegistration() {

        // Set title of the window
        setTitle("Employee Registration Form");

        // Set size of the window
        setSize(450, 300);

        // Close program when window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout
        setLayout(new FlowLayout());

        // Create text fields
        idField = new JTextField(20);
        nameField = new JTextField(20);
        departmentField = new JTextField(20);
        salaryField = new JTextField(20);

        // Create submit button
        submitButton = new JButton("Submit");

        // Add Employee ID label and field
        add(new JLabel("Employee ID:"));
        add(idField);

        // Add Name label and field
        add(new JLabel("Employee Name:"));
        add(nameField);

        // Add Department label and field
        add(new JLabel("Department:"));
        add(departmentField);

        // Add Salary label and field
        add(new JLabel("Salary:"));
        add(salaryField);

        // Add submit button
        add(submitButton);

        // Register button with ActionListener
        submitButton.addActionListener(this);

        // Display window
        setVisible(true);
    }

    // This method executes when Submit button is clicked
    public void actionPerformed(ActionEvent e) {

        // Get entered employee details
        String id = idField.getText();
        String name = nameField.getText();
        String department = departmentField.getText();
        String salary = salaryField.getText();

        // Display employee information in a dialog box
        JOptionPane.showMessageDialog(
                this,
                "Employee Details\n"
                + "Employee ID: " + id + "\n"
                + "Name: " + name + "\n"
                + "Department: " + department + "\n"
                + "Salary: " + salary
        );
    }

    public static void main(String[] args) {

        // Create Employee Registration Form
        new EmployeeRegistration();
    }
}
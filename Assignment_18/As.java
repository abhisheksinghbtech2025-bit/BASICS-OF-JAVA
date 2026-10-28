package Assignment_18;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class As extends JFrame implements ActionListener {

    // Text fields to enter numbers
    JTextField num1, num2;

    // Buttons for addition and subtraction
    JButton addButton, subButton;

    // Label to display result
    JLabel resultLabel;

    // Constructor
    As() {

        // Set window title
        setTitle("Simple Calculator");

        // Set window size
        setSize(400, 250);

        // Close application when window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use FlowLayout for arranging components
        setLayout(new FlowLayout());

        // Create text fields
        num1 = new JTextField(10);
        num2 = new JTextField(10);

        // Create buttons
        addButton = new JButton("Addition");
        subButton = new JButton("Subtraction");

        // Create result label
        resultLabel = new JLabel("Result: ");

        // Add components to window
        add(new JLabel("Enter First Number:"));
        add(num1);

        add(new JLabel("Enter Second Number:"));
        add(num2);

        add(addButton);
        add(subButton);

        add(resultLabel);

        // Register buttons with ActionListener
        addButton.addActionListener(this);
        subButton.addActionListener(this);

        // Make window visible
        setVisible(true);
    }

    // This method executes when a button is clicked
    public void actionPerformed(ActionEvent e) {

        // Get numbers from text fields
        double a = Double.parseDouble(num1.getText());
        double b = Double.parseDouble(num2.getText());

        // Check which button was clicked
        if (e.getSource() == addButton) {

            // Perform addition
            double result = a + b;

            // Display result
            resultLabel.setText("Result: " + result);

        } else if (e.getSource() == subButton) {

            // Perform subtraction
            double result = a - b;

            // Display result
            resultLabel.setText("Result: " + result);
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create calculator window
        new As();
    }
}
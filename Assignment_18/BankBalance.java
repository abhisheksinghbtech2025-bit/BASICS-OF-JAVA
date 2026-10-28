package Assignment_18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BankBalance extends JFrame implements ActionListener {

    // Text fields for balance and transaction amount
    JTextField balanceField, amountField;

    // Buttons for deposit and withdrawal
    JButton depositButton, withdrawButton;

    // Label to display updated balance
    JLabel resultLabel;

    // Variable to store current balance
    double balance;

    // Constructor
    BankBalance() {

        // Set window title
        setTitle("Bank Balance Calculator");

        // Set window size
        setSize(450, 250);

        // Close application when window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Arrange components using FlowLayout
        setLayout(new FlowLayout());

        // Create text fields
        balanceField = new JTextField(10);
        amountField = new JTextField(10);

        // Create buttons
        depositButton = new JButton("Deposit");
        withdrawButton = new JButton("Withdraw");

        // Create result label
        resultLabel = new JLabel("Updated Balance: ");

        // Add components to window
        add(new JLabel("Initial Balance:"));
        add(balanceField);

        add(new JLabel("Transaction Amount:"));
        add(amountField);

        add(depositButton);
        add(withdrawButton);

        add(resultLabel);

        // Register buttons with ActionListener
        depositButton.addActionListener(this);
        withdrawButton.addActionListener(this);

        // Make window visible
        setVisible(true);
    }

    // This method is called when a button is clicked
    public void actionPerformed(ActionEvent e) {

        // Get initial balance from the text field
        balance = Double.parseDouble(balanceField.getText());

        // Get transaction amount
        double amount = Double.parseDouble(amountField.getText());

        // Check if Deposit button was clicked
        if (e.getSource() == depositButton) {

            // Add transaction amount to balance
            balance = balance + amount;

            // Display updated balance
            resultLabel.setText("Updated Balance: " + balance);
        }

        // Check if Withdraw button was clicked
        else if (e.getSource() == withdrawButton) {

            // Subtract transaction amount from balance
            balance = balance - amount;

            // Display updated balance
            resultLabel.setText("Updated Balance: " + balance);
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create Bank Balance GUI
        new BankBalance();
    }
}
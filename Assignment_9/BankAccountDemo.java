/*
 * Assignment No: 9
 * Program 1: Bank Account using final Keyword
 *
 * Aim:
 * To demonstrate the use of the final keyword
 * with variables in Java.
 */

// BankAccount class
class BankAccount {

    // final variable (cannot be changed after initialization)
    final int accountNumber;

    // Other data members
    String accountHolderName;
    double balance;

    // Parameterized constructor
    BankAccount(int accountNumber, String accountHolderName, double balance) {

        // Initialize final variable
        this.accountNumber = accountNumber;

        // Initialize remaining variables
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method to display account details
    void displayAccountDetails() {

        System.out.println("------ Bank Account Details ------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : ₹" + balance);
    }

    /*
     * Uncommenting the below method will produce
     * a compilation error because accountNumber
     * is declared as final.
     */

    /*
    void changeAccountNumber() {
        accountNumber = 12345; // ERROR
    }
    */
}

// Main class
public class BankAccountDemo {

    public static void main(String[] args) {

        // Create BankAccount object
        BankAccount account = new BankAccount(
                100101,
                "Abhishek Singh",
                50000
        );

        // Display account details
        account.displayAccountDetails();
    }
}
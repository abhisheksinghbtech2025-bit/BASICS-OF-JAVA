class BankAccount {
    private int balance = 1000;

    synchronized void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Withdrawal failed: Insufficient balance");
        }
    }
}

class DepositThread extends Thread {
    BankAccount account;

    DepositThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            account.deposit(400);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Deposit thread interrupted");
            }
        }
    }
}

class WithdrawThread extends Thread {
    BankAccount account;

    WithdrawThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            account.withdraw(200);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Withdraw thread interrupted");
            }
        }
    }
}

public class BankThread {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        DepositThread deposit = new DepositThread(account);
        WithdrawThread withdraw = new WithdrawThread(account);

        deposit.start();
        withdraw.start();
    }
}
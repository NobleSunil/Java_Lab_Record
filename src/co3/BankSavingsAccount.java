package co3;

// Parent class
class BankAccount {

    // Private members cannot be accessed directly by subclasses
    private int accountNumber;
    private double balance;

    // Constructor
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}

// Child class
class SavingsAccount extends BankAccount {

    private double interestRate;

    // Constructor
    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Calculate one year's interest
    double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    // Display account details
    void displayAccount() {
        System.out.println("Account Details");
        System.out.println("---------------");
        System.out.println("Account Number : " + getAccountNumber());
        System.out.println("Balance : " + getBalance());
        System.out.println("Interest Rate : " + interestRate + "%");
        System.out.println("Interest Earned : " + calculateInterest());
    }
}

// Main class
public class BankSavingsAccount {

    public static void main(String[] args) {

        SavingsAccount account =
                new SavingsAccount(100245, 50000.0, 5);

        account.displayAccount();
    }
}
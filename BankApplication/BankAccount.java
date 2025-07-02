package BankApplication;

public class BankAccount {
    private String accountNumber;
    private String customerName;
    private double balance;

    public BankAccount(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getCustomerName() {
        return customerName;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    public void transfer(String recipientAccountNumber, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Transferred " + amount + " to account " + recipientAccountNumber);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for transfer.");
        } else {
            System.out.println("Transfer amount must be positive.");
        }
    }
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Customer Name: " + customerName + ", Balance: " + balance;
    }
    
    
}

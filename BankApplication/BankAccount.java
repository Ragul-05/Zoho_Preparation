package BankApplication;

import java.util.ArrayList;

public class BankAccount {
    private double balance;
    private ArrayList<String> transactionHistory;
    private String accountHolder;

    public BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: Rs." + amount);
        } else {
            transactionHistory.add("Failed Deposit: Invalid amount Rs." + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrawn: Rs." + amount);
        } else {
            transactionHistory.add("Failed Withdrawal: Rs." + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactionHistory() {
        System.out.println("\nTransaction History for " + accountHolder + ":");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}

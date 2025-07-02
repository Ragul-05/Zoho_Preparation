package BankApplication;

public class TransactionManager {
    public void deposit(BankAccount account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(BankAccount account, double amount) {
        account.withdraw(amount);
    }

    public void transfer(BankAccount account, String recipientAccountNumber, double amount) {
        account.transfer(recipientAccountNumber, amount);
    }
    
}

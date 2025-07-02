package BankApplication;
public class TransactionManager {
    public void simulateTransactions(BankAccount account) {
        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(700); 
        account.deposit(300);
        account.withdraw(200);
    }

    public void printSummary(BankAccount account) {
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Final Balance: Rs." + account.getBalance());
        account.printTransactionHistory();
    }
}

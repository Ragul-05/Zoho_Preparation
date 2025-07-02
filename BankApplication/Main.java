package BankApplication;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "John Doe", 1000.0);
        System.out.println("Account created: " + account);

        TransactionManager transactionManager = new TransactionManager();
        transactionManager.deposit(account, 500.0);
        System.out.println("After deposit: " + account);

        transactionManager.withdraw(account, 200.0);
        System.out.println("After withdrawal: " + account);

        transactionManager.transfer(account, "987654321", 300.0);
        System.out.println("After transfer: " + account);
        
    }
}

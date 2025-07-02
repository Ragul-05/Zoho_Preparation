package BankApplication;
public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Ragul");
        TransactionManager manager = new TransactionManager();

        manager.simulateTransactions(myAccount);
        manager.printSummary(myAccount);
    }
}

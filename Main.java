// Main.java

public class Main {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank();

        // Create and add accounts to the bank
        Account account1 = new Account(1001, 1500.0);
        Account account2 = new Account(1002, 2000.0);

        bank.addAccount(account1);
        bank.addAccount(account2);

        // Perform transactions
        Transaction.performTransaction(account1, 500.0);
        Transaction.performTransaction(account2, 800.0);

        // Display all accounts in the bank
        bank.displayAllAccounts();
    }
}

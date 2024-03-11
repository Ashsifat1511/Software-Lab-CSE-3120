package org.example;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(101, 1000.0);
        Account account2 = new Account(102, 500.0);
        System.out.println("Initial Balances:");
        System.out.println("Account " + account1.getAccountNumber() + ": $" + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + ": $" + account2.getBalance());
        boolean transferAmountSuccess = Transaction.transferAmount(account1, account2, 200.0);
        System.out.println("\nUpdated Balances:");
        if (transferAmountSuccess) {
            System.out.println("Account " + account1.getAccountNumber() + ": $" + account1.getBalance());
            System.out.println("Account " + account2.getAccountNumber() + ": $" + account2.getBalance());
        } else {
            System.out.println("Transaction failed. Insufficient funds in the sender's account.");
        }
    }
}


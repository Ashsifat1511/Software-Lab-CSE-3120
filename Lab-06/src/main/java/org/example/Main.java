package org.example;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(101, 1000.0);
        Account account2 = new Account(102, 500.0);
        boolean transferAmountSuccess = Transaction.transferAmount(account1, account2, 200.0);

    }
}


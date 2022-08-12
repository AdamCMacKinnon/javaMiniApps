package BankingApp;

import BankingApp.accounts.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Account account1 = new SavingsAccount(500, 0.024);
        CheckingAccount account2 = new GoldCheckingAccount(1000, 0.032, 2500);
        Account account3 = new SilverCheckingAccount(200, 0.011, 1500);

        account1.status();
        account1.withdraw(90);
        account1.status();

        System.out.println("\n-----------------------\n");

        account3.status();

        System.out.println("\n-----------------------\n");
        System.out.println("ARRAY LIST EXAMPLE!!");
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new SilverCheckingAccount(450, 0.015, 900));
        accounts.add(new GoldCheckingAccount(800, 0.20, 1000));
        accounts.add(new DiamondCheckingAccount(1000, 0.33, 2500));
        accounts.add(new SavingsAccount(5000, 0.40));

        for (Account account : accounts) {
            account.status();
            System.out.println();
        }

    }
}

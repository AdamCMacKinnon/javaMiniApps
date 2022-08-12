package BankingApp.accounts;

public class SavingsAccount extends Account {
    public SavingsAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }
    @Override
    public boolean withdraw(double amount) {
        double fee = 0.025 * amount;
        amount += fee;
        return super.withdraw(amount);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }
}

package BankingApp.accounts;

public class SilverCheckingAccount extends CheckingAccount {
    public SilverCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }
    @Override
    public int calculateRewardPoints(double cost) {
        return (int) (cost * 25);
    }
}

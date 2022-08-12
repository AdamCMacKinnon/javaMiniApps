package BankingApp.accounts;

public class DiamondCheckingAccount extends CheckingAccount {
    public DiamondCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }
    @Override
    public int calculateRewardPoints(double cost) {
        int rewards = 0;
        if (cost > 500) {
            rewards += (cost - 500) * 80;
        }
        if (cost > 100) {
            rewards += (cost - 100) * 65;
        }
        rewards += cost * 40;
        return rewards;
    }
}

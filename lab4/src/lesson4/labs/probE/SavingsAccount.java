package lesson4.labs.probE;

public class SavingsAccount extends Account {

    private double balance;
    private double interestRate;
    private String accId;

    public SavingsAccount(String accId,
                           double interestRate, double startBalance) {
        this.interestRate = interestRate;
        this.balance = startBalance;
        this.accId = accId;
    }


    @Override
    String getAccountID() {
        return accId;
    }

    @Override
    double getBalance() {
        return balance;
    }

    @Override
    double computeUpdatedBalance() {
        return balance + (interestRate * balance);
    }
}

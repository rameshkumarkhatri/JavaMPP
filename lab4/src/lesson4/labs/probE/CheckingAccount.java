package lesson4.labs.probE;

import com.sun.tools.javac.comp.Check;

public class CheckingAccount extends Account {

    private double balance;
    private double monthlyFees;
    private String accId;

    public CheckingAccount(String accId,
             double fees, double startBalance) {
        this.monthlyFees = fees;
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
        return balance - monthlyFees;
    }
}

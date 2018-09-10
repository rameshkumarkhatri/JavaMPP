package lesson4.labs.probE;

import java.util.ArrayList;

public class Employee {

    private String name;

    ArrayList<Account> accounts;

    Employee(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account acc) {
        if (acc != null)
            accounts.add(acc);
    }

    public double computeUpdatedBalanceSum() {
        double sum = 0;
        for (Account account : accounts)
            sum += account.computeUpdatedBalance();
        return sum;
    }
}

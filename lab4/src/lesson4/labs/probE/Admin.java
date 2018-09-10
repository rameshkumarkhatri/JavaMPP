package lesson4.labs.probE;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Admin {

    public static void computeUpdatedBallanceSum(List<Employee> employees) {

        double sum = 0;
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next().computeUpdatedBalanceSum();
        }

        System.out.println("SUM : " + sum);

    }


    public static void main(String[] arg) {

        List<Employee> employees = new ArrayList<>();

        Employee employee = new Employee("Marinda");
        employee.addAccount(new SavingsAccount("119A", 0.05, 100)); // 5%  = 0.05
        employee.addAccount(new CheckingAccount("119B", 10, 100));

        Employee employee1 = new Employee("Nena");
        employee1.addAccount(new SavingsAccount("11A", .1, 1000)); // 10%  = 0.1
        employee1.addAccount(new CheckingAccount("10A", 5, 1000));

        employees.add(employee);
        employees.add(employee1);

        computeUpdatedBallanceSum(employees);
    }


}

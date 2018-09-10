package lesson4.labs.probC;

import java.util.ArrayList;

public class Commissioned extends Employee {
    private final double commission;
    private final double baseSalary;

    private ArrayList<Order> orders;

    Commissioned(int id, double commission, double baseSalary) {
        this.empId = id;
        this.commission = commission;
        this.baseSalary = baseSalary;
        orders = new ArrayList<>();
    }

    @Override
    public double calGrossSalary(int month, int year) {
        double gross = 0;
        for(Order o: orders) {
          gross += o.getOrderAmount();
        }
        return gross;
    }

    public void addOrder(Order order) {
        if(order != null)
            orders.add(order);
    }
}

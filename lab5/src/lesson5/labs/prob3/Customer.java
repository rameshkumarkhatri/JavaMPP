package lesson5.labs.prob3;

import java.time.LocalDate;
import java.util.*;

final public class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        orders = new ArrayList<Order>();
    }

    public Order addOrder(LocalDate dateOfOrder) {
        Order ord = new Order(dateOfOrder, this);
        orders.add(ord);
        return ord;
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }
}

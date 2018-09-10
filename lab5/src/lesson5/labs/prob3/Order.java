package lesson5.labs.prob3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


final public class Order {
    private LocalDate orderDate;
    private List<Item> items;
    private Customer customer;

    //package level access
    Order(LocalDate orderDate, Customer customer) {
        this.orderDate = orderDate;
        this.customer = customer;
        items = new ArrayList<Item>();
    }

    public void addItem(String name) {
        items.add(new Item(name));
    }

    @Override
    public String toString() {
        return orderDate + ": " +
                items.toString();
    }
}

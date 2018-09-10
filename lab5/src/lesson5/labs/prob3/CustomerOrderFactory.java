package lesson5.labs.prob3;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

final public class CustomerOrderFactory {

    private CustomerOrderFactory() {
    }

    public static CustomerAndOrderImp createCustomerOrder(String customerName, LocalDate[] orderDates, List<String>[] items) {
        Customer customer = new Customer(customerName);
        List<Order> orders = new ArrayList<>();
        if (orderDates != null) {
            for (int i = 0; i < orderDates.length; i++) {
                LocalDate date = orderDates[i];
                Order o = new Order(date, customer);
                if (items[i] != null && items[i].size() > 0)
                    for (String iitem : items[i])
                        o.addItem(iitem);
                orders.add(o);
            }
        }
        CustomerAndOrderImp customerAndOrderImp = new CustomerAndOrderImp(customer, orders);
        return customerAndOrderImp;

    }

}

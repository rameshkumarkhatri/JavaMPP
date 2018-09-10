package lesson5.labs.prob3;

import java.util.ArrayList;
import java.util.List;

final public class CustomerAndOrderImp implements CustomerAndOrder {
    private Customer customer;
    private List<Order> order;

    CustomerAndOrderImp(Customer c, List<Order> o){
        this.customer = c;
        this.order = o;
    }

    @Override
    public List<Order> getOrder() {
        return order;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        String str = "Customer : "+customer.getName();
        for(Order o: order)
            str = str+"\n\t"+order.toString();
        return str;
    }
}

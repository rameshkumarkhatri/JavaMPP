package lesson5.labs.prob3.extpackage;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import lesson5.labs.prob3.Customer;
import lesson5.labs.prob3.*;

public class Main {
    public static void main(String[] args) {

        CustomerAndOrderImp customerAndOrderImp = CustomerOrderFactory.createCustomerOrder("Bob",
                new LocalDate[]{LocalDate.now()},
                new List[]{Arrays.asList("Math book", "Novel Book")});

        System.out.println(customerAndOrderImp.toString());
//        Customer cust = new Customer("Bob");
//        Order order = cust.addOrder(LocalDate.now());
//        order.addItem("Shirt");
//        order.addItem("Laptop");
//        order = cust.addOrder(LocalDate.now());
//        order.addItem("Pants");
//        order.addItem("Knife set");
//        System.out.println(cust.getOrders());
        //cannot directly create an Order here
    }
}

		

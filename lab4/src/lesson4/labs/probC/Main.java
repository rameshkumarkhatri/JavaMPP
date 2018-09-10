package lesson4.labs.probC;


import java.time.LocalDate;
import java.util.Iterator;

public class Main {

    public static void main(String[] arg) {

        LocalDate localDate = LocalDate.of(2018, 9, 6);

        Order order = new Order(1, 1000, localDate);
        Order order1 = new Order(2, 2000, localDate);
        Order order2 = new Order(3, 3000, localDate);

        Hourly hourly = new Hourly(1, 10, 20);
        Hourly hourly1 = new Hourly(2, 20, 10);

        Salaried salaried = new Salaried(3, 1000);
        Salaried salaried1 = new Salaried(4, 2000);

        Commissioned commissioned  = new Commissioned(4, 10, 1000);
        commissioned.addOrder(order);

        Commissioned commissioned1  = new Commissioned(5, 15, 800);
        commissioned1.addOrder(order1);
        commissioned1.addOrder(order2);

//        hourly.calculateCompensation(localDate.getMonthValue(), localDate.getYear());

        Employee[] employees = new Employee[]{
                hourly, hourly1, salaried, salaried1, commissioned, commissioned1
        };

        for(Employee e : employees)
        {
            Paycheck paycheck = e.calculateCompensation(localDate.getMonthValue(), localDate.getYear());
            paycheck.print();
        }



    }

}

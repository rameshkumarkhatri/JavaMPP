package lesson4.labs.probC;

import java.time.LocalDate;

public class Order {
        private int orderNo, orderAmount;
        private LocalDate orderDate;

        Order( int orderNo, int orderAmount, LocalDate orderDate) {
            this.orderAmount = orderAmount;
            this.orderDate = orderDate;
            this.orderNo = orderNo;
        }

    public double getOrderAmount() {
        return orderAmount;
    }
}

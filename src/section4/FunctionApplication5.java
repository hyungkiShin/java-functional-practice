package section4;

import section4.model.Order;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionApplication5 {
    public static void main(String[] args) {
        Order order1 = new Order()
                .setId(1001)
                .setCreatedByUserId(100)
                .setStatus(Order.OrderStatus.CREATED);

        Order order2 = new Order()
                .setId(1002)
                .setCreatedByUserId(101)
                .setStatus(Order.OrderStatus.ERROR);

        Order order3 = new Order()
                .setId(1003)
                .setCreatedByUserId(102)
                .setStatus(Order.OrderStatus.PROCESSED);

        Order order4 = new Order()
                .setId(1004)
                .setCreatedByUserId(103)
                .setStatus(Order.OrderStatus.ERROR);

        Order order5 = new Order()
                .setId(1005)
                .setCreatedByUserId(104)
                .setStatus(Order.OrderStatus.IN_PROGRESS);

        List<Order> orders = Arrays.asList(order1, order2, order3, order4, order5);
        final List<Long> collect = orders.stream().map(Order::getCreatedByUserId).collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}

package section4;

import section4.model.Order;
import section4.model.OrderLine;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionApplication7 {
    public static void main(String[] args) {
        String [][] cities = new String[][] {
                { "Seoul", "Busan" },
                { "San Francisco", "New york" },
                { "Madrid", "Barcelona" }
        };

        final Stream<String[]> cityStream = Arrays.stream(cities);
        final Stream<Stream<String>> cityStreamStream = cityStream.map(x -> Arrays.stream(x));
        final List<Stream<String>> cityStreamList = cityStreamStream.collect(Collectors.toList());

        final Stream<String[]> cityStream2 = Arrays.stream(cities);
        final Stream<String> stringStream = cityStream2.flatMap(x -> Arrays.stream(x));
        System.out.println("stringStream = " + stringStream.collect(Collectors.toList()));

        Order order1 = new Order().setId(1001).setOrderLines(Arrays.asList(
                new OrderLine()
                        .setId(10001)
                        .setType(OrderLine.OrderLineType.PURCHASE)
                        .setAmount(BigDecimal.valueOf(5000))
        ));

        Order order2 = new Order().setId(1002).setOrderLines(Arrays.asList(
                new OrderLine()
                        .setId(10002)
                        .setType(OrderLine.OrderLineType.PURCHASE)
                        .setAmount(BigDecimal.valueOf(4000)),
                new OrderLine()
                        .setId(10003)
                        .setType(OrderLine.OrderLineType.DISCOUNT)
                        .setAmount(BigDecimal.valueOf(-2000))
                ));

        Order order3 = new Order().setId(1003).setOrderLines(Arrays.asList(
                new OrderLine()
                        .setId(10003)
                        .setType(OrderLine.OrderLineType.PURCHASE)
                        .setAmount(BigDecimal.valueOf(2000))
                ));

        List<Order> orders = Arrays.asList(order1, order2, order3);

        final List<OrderLine> listStream = orders.stream()
                .map(Order::getOrderLines)
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("listStream = " + listStream);
    }
}

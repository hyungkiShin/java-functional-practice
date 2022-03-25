package section4;

import section4.model.FUser;
import section4.model.Order;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.time.LocalDateTime.now;

public class FunctionApplication6 {
    public static void main(String[] args) {
       List<Integer> numbers = Arrays.asList(3,-5,7,4);
        final List<Integer> collect = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("collect = " + collect);

        FUser user1 = new FUser()
                .setId(1L)
                .setName("Paul")
                .setVerified(true)
                .setEmailAddress("alice@naver.com");

        FUser user2 = new FUser()
                .setId(2L)
                .setName("David")
                .setVerified(true)
                .setEmailAddress("bob@naver.com");

        FUser user3 = new FUser()
                .setId(3L)
                .setName("John")
                .setVerified(true)
                .setEmailAddress("charlie@naver.com");

        final List<FUser> fUsers = Arrays.asList(user1, user2, user3);
        final List<FUser> collect1 = fUsers.stream().sorted(Comparator.comparing(FUser::getName)).collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);

        Order order1 = new Order()
                .setId(1001)
                .setCreatedByUserId(100)
                .setStatus(Order.OrderStatus.CREATED)
                .setCreatedAt(now().minusHours(10));

        Order order2 = new Order()
                .setId(1002)
                .setCreatedByUserId(101)
                .setStatus(Order.OrderStatus.ERROR)
                .setCreatedAt(now().minusHours(40));

        Order order3 = new Order()
                .setId(1003)
                .setCreatedByUserId(102)
                .setStatus(Order.OrderStatus.PROCESSED)
                .setCreatedAt(now().minusHours(20));

        Order order4 = new Order()
                .setId(1004)
                .setCreatedByUserId(103)
                .setStatus(Order.OrderStatus.ERROR)
                .setCreatedAt(now().minusHours(30));

        Order order5 = new Order()
                .setId(1005)
                .setCreatedByUserId(104)
                .setStatus(Order.OrderStatus.IN_PROGRESS)
                .setCreatedAt(now().minusHours(00));

        List<Order> orders = Arrays.asList(order1, order2, order3, order4, order5);
     final List<Order> collect2 = orders.stream().sorted(Comparator.comparing(Order::getCreatedAt)).collect(Collectors.toList());
     System.out.println("orders = " + collect2);
    }
}

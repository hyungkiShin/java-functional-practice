package section4;

import section4.model.FUser;
import section4.model.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionApplication4 {
    public static void main(String[] args) {
        FUser user = new FUser()
                .setId(1L)
                .setName("Alice")
                .setVerified(true)
                .setEmailAddress("alice@naver.com");
        FUser user1 = new FUser()
                .setId(2L)
                .setName("Bob")
                .setVerified(false)
                .setEmailAddress("bob@naver.com");
        FUser user2 = new FUser()
                .setId(3L)
                .setName("Charlie")
                .setVerified(false)
                .setEmailAddress("charlie@naver.com");

        List<FUser> users = Arrays.asList(user, user1, user2);

        /**
         *         List<String> emails = new ArrayList<>();
         *         for (FUser iuser: users) {
         *            if (!iuser.isVerified()) {
         *                String email = iuser.getEmailAddress();
         *                emails.add(email);
         *            }
         *         }
         */

        final List<String> emailStream = users
                .stream()
                .filter(v -> !v.isVerified())
                .map(FUser::getEmailAddress)
                .collect(Collectors.toList());

        System.out.println("emailStream = " + emailStream);

        Order order1 = new Order()
                .setId(1001)
                .setStatus(Order.OrderStatus.CREATED);

        Order order2 = new Order()
                .setId(1001)
                .setStatus(Order.OrderStatus.ERROR);

        Order order3 = new Order()
                .setId(1001)
                .setStatus(Order.OrderStatus.PROCESSED);

        Order order4 = new Order()
                .setId(1001)
                .setStatus(Order.OrderStatus.ERROR);

        Order order5 = new Order()
                .setId(1001)
                .setStatus(Order.OrderStatus.IN_PROGRESS);

        List<Order> orders = Arrays.asList(order1, order2, order3, order4, order5);

        // Filter orders in ERROR state
        List<Order> filteredOrders = orders.stream().filter(order -> order.getStatus() == Order.OrderStatus.ERROR).collect(Collectors.toList());

        System.out.println("filteredOrders = " + filteredOrders);
    }
}

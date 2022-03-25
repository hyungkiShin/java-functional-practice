package section4;

import section4.model.FUser;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FunctionApplication2 {
    public static void main(String[] args) {
        final Stream<Integer> numberStream = Stream.of(3, -5, 7, 10, -3);
        final Stream<Integer> filteredNumberStream = numberStream.filter(x -> x > 0);
        final List<Integer> collect = filteredNumberStream.collect(toList());
        System.out.println("collect = " + collect);

        final List<Integer> collect1 =
                Stream.of(3, -5, 7, 10, -3)
                .filter(x -> x > 0)
                .collect(toList());

        System.out.println("collect1 = " + collect1);

        FUser user1 = new FUser()
                .setId(1L)
                .setName("Alice")
                .setVerified(true)
                .setEmailAddress("alice@naver.com");

        FUser user2 = new FUser()
                .setId(2L)
                .setName("Bob")
                .setVerified(true)
                .setEmailAddress("bob@naver.com");

        FUser user3 = new FUser()
                .setId(3L)
                .setName("Charlie")
                .setVerified(true)
                .setEmailAddress("charlie@naver.com");

        final List<FUser> fUsers = Arrays.asList(user1, user2, user3);
        final List<FUser> collect2 = fUsers.stream().filter(FUser::isVerified).collect(toList());
        final List<FUser> collect3 = fUsers.stream().filter(user -> !user.isVerified()).collect(toList());
        System.out.println("collect2 = " + collect2);
        System.out.println("collect3 = " + collect3);
    }
}

package section3;

import section3.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class FunctionApplication2 {
    public static void main(String[] args) {
        Function<String, Integer> strLength = String::length;
        Integer hello_world = strLength.apply("hello world");
//        System.out.println("hello_world = " + hello_world);

        BiPredicate<String, String> strEquals = String::equals;
        boolean test = strEquals.test("hello", "world");
//        System.out.println("test = " + test);
//        System.out.println("test = " + strEquals.test("hello", "hello"));
        List<User> users = new ArrayList<>();
        users.add(new User(3, "Allice"));
        users.add(new User(1, "Challi"));
        users.add(new User(5, "Bob"));
//        System.out.println("users = " + users);

        printUserField(users, User::getName);
    }

    public static void printUserField(List<User> users, Function<User, Object> getter) {
        for (User user: users) {
            System.out.println("user = " + getter.apply(user));
        }
    }
}

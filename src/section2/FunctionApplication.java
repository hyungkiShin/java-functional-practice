package section2;

import section2.model.User;

import java.util.*;

public class FunctionApplication {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(3,"Alice"));
        users.add(new User(1,"Bob"));
        users.add(new User(5,"Charlie"));
        System.out.println("users = " + users);

        Comparator<User> idComparator = (u1, u2) -> u1.getId() - u2.getId();
        Collections.sort(users, idComparator);
        System.out.println("users = " + users);

        Collections.sort(users, (u1,u2) -> u1.getName().compareTo(u2.getName()));
        System.out.println("users = " + users);
    }
}

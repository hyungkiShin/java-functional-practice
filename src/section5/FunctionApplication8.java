package section5;

import section4.model.FUser;
import section5.model.User;

import java.util.Optional;

public class FunctionApplication8 {
    public static void main(String[] args) {
        final Optional<User> maybeUser = Optional.ofNullable(maybeGetUser(true));
        maybeUser.ifPresent(user -> System.out.println(user));

        final Optional<Integer> maybeId = Optional
                .ofNullable(maybeGetUser(true))
                .map(user -> user.getId());
        maybeId.ifPresent(System.out::println);

        final String name_is_empty = Optional.ofNullable(maybeGetUser(false))
                .map(User::getName)
                .map(name -> "The name is " + name)
                .orElse("Name is empty");
        System.out.println(name_is_empty);

        final Optional<String> maybeEmail = Optional.ofNullable(maybeGetUser(true)).flatMap(User::getEmailAddress);
        maybeEmail.ifPresent(System.out::println);
    }

    public static User maybeGetUser(boolean returnUser) {
        if(returnUser) {
            return new User()
                    .setId(1001)
                    .setName("Alice")
                    .setEmailAddress("alice@naver.com")
                    .setVerified(false);
        }
        return null;
    }
}

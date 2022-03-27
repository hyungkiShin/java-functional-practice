package section5;

import section4.model.FUser;

import java.util.Optional;

public class FunctionApplication8 {
    public static void main(String[] args) {
        final Optional<FUser> maybeUser = Optional.ofNullable(maybeGetUser(true));
        maybeUser.ifPresent(user -> System.out.println(user));
    }

    public static FUser maybeGetUser(boolean returnUser) {
        if(returnUser) {
            return new FUser().setId(1001).setName("Alice").setEmailAddress("alice@naver.com").setVerified(false);
        }
        return null;
    }
}

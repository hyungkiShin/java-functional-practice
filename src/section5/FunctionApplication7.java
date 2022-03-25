package section5;

import section4.model.FUser;

import java.util.Optional;

public class FunctionApplication7 {
    public static void main(String[] args) {
        FUser user1 = new FUser()
                .setId(1)
                .setName("Alice")
                .setVerified(false);

        FUser user2 = new FUser()
                .setId(1)
                .setName("Alice")
                .setEmailAddress("bob@naver.com")
                .setVerified(false);

//        System.out.println("same = " + userEquals(user1, user2));
        String someEmail = "some@email.com";
        String nullEmail = null;

        Optional<String> maybeEmail = Optional.of(someEmail);
        Optional<String> maybeEmail2 = Optional.empty();
        Optional<String> maybeEmail3 = Optional.ofNullable(someEmail);
        Optional<String> maybeEmail4 = Optional.ofNullable(nullEmail);

        String email = maybeEmail.get();
        System.out.println("email = " + email);
//        String email2 = maybeEmail2.get();
        if(maybeEmail2.isPresent()) {
            System.out.println("maybeEmail2 = " + maybeEmail2.get());
        }

        String defaultEmail = "defaultEmail@naver.com";
        String email3 = maybeEmail2.orElse(defaultEmail); // maybeEmail2 를 체크해보고 비어있다면 defaultEmail 을 리턴해준다.
//        System.out.println("email3 = " + email3);
        final String email4 = maybeEmail2.orElseGet(() -> defaultEmail);
//        System.out.println("email4 = " + email4);
        final String email5 = maybeEmail2.orElseThrow(() -> new RuntimeException("email not present"));
        System.out.println("email5 = " + email5);

    }

    public static boolean userEquals(FUser u1, FUser u2) {
        return u1.getId() == u2.getId()
                && u1.getName().equals(u2.getName())
                && u1.getEmailAddress().equals(u2.getEmailAddress())
                && u1.isVerified() == u2.isVerified();
    }
}

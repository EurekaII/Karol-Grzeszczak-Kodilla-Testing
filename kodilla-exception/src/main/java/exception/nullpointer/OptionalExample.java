package exception.nullpointer;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("user1");

        Optional<User> optionalUser= Optional.ofNullable(user);
        String username = optionalUser.orElse(new User("")).getName();

        System.out.println(username);

        // present
        optionalUser.ifPresent(u -> System.out.println(u.getName()));
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html
    }
}

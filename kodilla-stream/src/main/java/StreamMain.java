
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.time.LocalDate;


public class StreamMain {

    public static void main(String[] args) {

        //method reference
        new Forum().getUserList().stream()
                .filter(ForumUser::isFemale)
                .filter(ForumUser::isOver20)
                .filter(ForumUser::hasPosts)
                .forEach(System.out::println);
        System.out.println("####################");
        //using lambdas
        new Forum().getUserList().stream()
                .filter(e -> e.getGender() == 'F' || e.getGender() == 'f')
                .filter(e -> LocalDate.now().getYear() - e.getBirthdate().getYear() >= 20) // dla przykładu stary warunek
                //.filter(e -> e.isOver20()) można użyć tak
                .filter(e -> e.getPosts() > 0)
                .forEach(System.out::println);
    }
}


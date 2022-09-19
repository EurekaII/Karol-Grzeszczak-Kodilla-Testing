package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<ForumUser> forumUsers;

    public Forum() {

        forumUsers = new ArrayList<>();
        forumUsers.add(new ForumUser("Lisa", 'F', LocalDate.of(1996, Month.MAY, 23), 8));
        forumUsers.add(new ForumUser("Dorota", 'F', LocalDate.of(1965, Month.MARCH, 26), 10));
        forumUsers.add(new ForumUser("Karol", 'M', LocalDate.of(1992, Month.JANUARY, 7),11));
        forumUsers.add(new ForumUser("Mieczyslaw", 'M', LocalDate.of(1965, Month.APRIL, 14),33));
        forumUsers.add(new ForumUser("Agnieszka", 'F', LocalDate.of(1994, Month.OCTOBER, 26),1));
        forumUsers.add(new ForumUser("Maks", 'M', LocalDate.of(2004, Month.FEBRUARY, 11),17));
        forumUsers.add(new ForumUser("Franciszek", 'M',LocalDate.of(1991, Month.SEPTEMBER, 11),0));
        forumUsers.add(new ForumUser("Emilia", 'F', LocalDate.of(1991, Month.JULY, 7), 0));
        forumUsers.add(new ForumUser("Lola", 'F', LocalDate.of(2002, Month.SEPTEMBER, 19), 10));
        forumUsers.add(new ForumUser("Lala", 'F', LocalDate.of(2002, Month.SEPTEMBER, 21), 10));
    }
    public List<ForumUser> getUserList() {
        return forumUsers;
    }
}

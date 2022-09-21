
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.person.People;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {
        People.getList().stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);
        System.out.println("--------------------------------");
        People.getList().stream()
                .map(String::toUpperCase)
                .forEach(s -> System.out.println(s));
        System.out.println("--------------------------------");
        People.getList().stream()
                .filter(s -> s.length() > 11)
                .forEach(System.out::println);
        System.out.println("--------------------------------");
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.charAt(0) == 'M')
                //.filter(s -> s.substring(0, 1).equals("M")) to samo co wyżej
                .forEach(System.out::println);
        System.out.println("--------------------------------");
        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);
        System.out.println("--------------------------------");
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks
                .forEach(System.out::println);
        System.out.println("--------------------------------");
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
        System.out.println("--------------------------------");
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);
    }
}


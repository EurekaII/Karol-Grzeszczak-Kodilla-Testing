package exception.index;

import java.util.List;

public class IndexExceptionRunner {

    public static void main(String[] args) {
        VideoCollector videoCollector = new VideoCollector();
        List<String> collection = videoCollector.getCollection();

        String movie = collection.get(0);
        System.out.println(movie);

        // wywala exception IndexOutOfBoundsException
        String anotherMovie = collection.get(2);
        System.out.println(anotherMovie);


    }
}
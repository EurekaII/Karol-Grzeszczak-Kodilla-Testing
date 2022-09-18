import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("LISA", (text) -> text.toLowerCase());
        poemBeautifier.beautify("LISA", (text) -> "ABC " + text + " ABC");
        poemBeautifier.beautify("LISA", (text) -> text.substring(0, 2));
        poemBeautifier.beautify("LISA", (text) -> text.replace("A", "EK"));

    }
}


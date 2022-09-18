
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


@DisplayName("Collection Test Suite")
public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Starting test case");
    }
    @AfterEach
    public void after() {
        System.out.println("Ending test case");
    }

    @DisplayName("create empty array, " +
            "then check if exterminator method work properly for empty array")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> testArray = new ArrayList<>();
        //When
        oddNumbersExterminator.exterminate(testArray);

        int expectedResult = 0;
        List<Integer> resultArray = oddNumbersExterminator.exterminate(testArray);
        int result = resultArray.size();
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
    @DisplayName("Filing list with numbers," +
    "then check if extermination method work properly")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> nums = IntStream.range(1,10)
                .boxed()
                .collect(Collectors.toList());

        //When
        new OddNumbersExterminator().exterminate(nums)
                .forEach(System.out::println);
        List<Integer> resultArray = oddNumbersExterminator.exterminate(nums);
        int result = resultArray.size();
        int expectedResult = 4;
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}

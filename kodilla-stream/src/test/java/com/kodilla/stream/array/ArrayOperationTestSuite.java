package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationTestSuite {

    @Test
    void testGetAverage() {

        //Given
        int[] exampleNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31};
        //When
        double average = ArrayOperations.getAverage(exampleNumbers);
        double expectedAverage = 13.8;
        //Then
        Assertions.assertEquals(expectedAverage, average);
    }
}

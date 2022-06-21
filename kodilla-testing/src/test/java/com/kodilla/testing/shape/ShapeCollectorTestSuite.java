package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape test suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for figures")
    class TestFigures {
        @Test
        public void addFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(2.0));

            //When
            result shapeCollector.addFigure(new Circle(2.0));


            //Then
            Assertions.assertTrue(result);
        }
        @Test
        public void removeFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(2.0));

            //When
            boolean result = shapeCollector.removeFigure(shapeCollector.getFigure());

            //Then
        }
        @Test
        public void getFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(2.0));

            //When
             = shapeCollector.getFigure().getShapeName();
            //Then
        }
        @Test
        public void showFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(2.0));

            //When

            //Then
        }
    }
}

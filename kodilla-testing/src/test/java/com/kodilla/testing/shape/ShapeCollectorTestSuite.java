package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


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
            ShapeCollector collector = new ShapeCollector();
            Circle circle = new Circle("Koło1", 4);
            Triangle triangle = new Triangle("Trojkat", 4,3);


            //When
            collector.addFigure(circle);
            collector.addFigure(triangle);


            //Then
            assertEquals(2, collector.getShapesQuantity());



        }
        @Test
        public void removeFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Circle circle = new Circle("Koło1", 4);
            Triangle triangle = new Triangle("Trojkat", 4,3);
            collector.addFigure(circle);
            collector.addFigure(triangle);

            //When
            collector.removeFigure(circle);


            //Then
            assertEquals(1, collector.getShapesQuantity());

}
        @Test
        public void getFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Circle circle = new Circle("Kolo1", 4);
            collector.addFigure(circle);
            //When
            collector.getShape(0);


            //Then
            assertEquals(circle, collector.getShape(0));

        }
        @Test
        public void showFigures() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Circle circle = new Circle("Koło1", 4);
            Triangle triangle = new Triangle("Trojkat", 4,3);

            //When
            collector.addFigure(triangle);
            collector.addFigure(circle);


            //Then
            assertEquals(2, collector.showFigures().size());
}
    }
}

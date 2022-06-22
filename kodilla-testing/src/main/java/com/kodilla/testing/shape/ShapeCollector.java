package com.kodilla.testing.shape;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public boolean addFigure(Shape shape) {
        return false;
    }

    public Shape removeFigure(Shape shape) {
        return shape;
    }

    public Shape getFigure() {
        return null;
    }

    public void showFigures() {
        //empty
    }
}

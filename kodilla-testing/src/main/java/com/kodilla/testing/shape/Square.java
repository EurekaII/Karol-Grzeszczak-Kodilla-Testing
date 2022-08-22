package com.kodilla.testing.shape;

public class Square implements Shape {
    private final String name;
    private final double width;

    public Square(final String name, final double width) {
        this.name = name;
        this.width = width;
    }
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return Math.pow(width, 2.0);
    }

    public String toString() {
        return this.name;
    }
}
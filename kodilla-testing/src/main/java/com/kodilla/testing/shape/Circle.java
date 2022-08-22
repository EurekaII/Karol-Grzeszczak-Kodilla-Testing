package com.kodilla.testing.shape;

public class Circle implements Shape {
    private final String name;
    private final double radius;

    public Circle(final String name, final double radius) {
        this.name = name;
        this.radius = radius;
    }
    public String getShapeName() {
        return this.name;
    }
    public double getField() {
        return Math.PI * Math.pow(this.radius, 2.0);
    }

    public String toString() {
        return this.name;
    }
}

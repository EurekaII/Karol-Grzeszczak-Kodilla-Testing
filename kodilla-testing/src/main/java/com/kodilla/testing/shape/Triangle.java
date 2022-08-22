package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private final String name;
    private final double base;
    private final double height;

    public Triangle(String name, double base, double height) {
        this.name = name;
        this.base = base;
        this.height = height;
    }
    public String getShapeName() {
        return this.name;
    }
    public double getField() {
        return (this.base * this.height)/2;
    }

    public String toString() {
        return this.name;
    }

}
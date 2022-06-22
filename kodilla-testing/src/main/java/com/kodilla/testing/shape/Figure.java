package com.kodilla.testing.shape;

abstract class Figure implements Shape {

    protected final double side;

    public Figure(double side) {
        this.side = side;
    }

    public String getShapeName() {
        return this.getClass().getSimpleName();
    }
}

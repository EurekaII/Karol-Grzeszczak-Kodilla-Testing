package com.kodilla.testing.shape;

class Triangle extends Figure {

    public Triangle(double side) {
        super(side);
    }

    @Override
    public double getField() {
        return side * side / 4 * Math.sqrt(3.0);
    }
}
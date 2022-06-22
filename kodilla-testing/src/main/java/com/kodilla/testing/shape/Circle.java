package com.kodilla.testing.shape;

class Circle extends Figure {

    public Circle(double side) {
        super(side);
    }

    @Override
    public double getField() {
        return 1.0 / 2 * Math.PI * side * side;
    }
}

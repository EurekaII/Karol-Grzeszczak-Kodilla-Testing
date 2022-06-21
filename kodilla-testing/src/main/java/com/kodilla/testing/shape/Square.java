package com.kodilla.testing.shape;

class Square extends Figure {

    public Square(double side) {
        super(side);
    }

    @Override
    public double getField() {
        return side * side;
    }
}
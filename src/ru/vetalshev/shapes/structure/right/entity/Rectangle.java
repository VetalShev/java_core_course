package ru.vetalshev.shapes.structure.right.entity;

public class Rectangle extends AbstractShape {

    private double b;

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public double getPerimeter() {
        return 0;
    }

    public double getSquare() {
        return 0;
    }
}

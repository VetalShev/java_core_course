package ru.vetalshev.shapes.structure.wrong.entity;

public class Triangle extends AbstractShape {

    private double b;
    private double angle;

    public Triangle(double a, double b, double angle) {
        super(a);
        this.b = b;
        this.angle = angle;
    }

    public double getB() {
        return b;
    }

    public double getAngle() {
        return angle;
    }

    public double getC() {
        // обязательно ли использовать геттеры в этой формуле ???
        double c = Math.pow(getA(), 2) + Math.pow(getB(), 2) - 2 * getA() * getB() * Math.cos(getAngle()); // теорема косинусов

        return c;
    }
}

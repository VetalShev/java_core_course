package ru.vetalshev.collections.homework.model;

public class Line {

    private Point point1;
    private Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public boolean contains(Point point) {

        float vectorX = getPoint2().getX() - getPoint1().getX();
        float vectorY = getPoint2().getY() - getPoint1().getY();

        Point linePoint1 = getPoint1();
        Point linePoint2 = getPoint2();

        return ((point.getX() - linePoint1.getX()) / vectorX == (point.getY() - linePoint1.getY()) / vectorY);

//    Определить принадлежит ли точка А(5;-1,5) прямой MN. M(2;-3), N(-3;4)
//    1) Находим координаты вектора MN:
//            MN={-3-2;4-(-3)}
//            MN={-5;7}
//
//    2)Составляем уравнение прямой MN:
//            (x-2)/-5 = (y+3)/7
//            7x-14=-5y-15
//            7x+5y+1=0 - искомое уравнение
//
//    3)Принадлежит ли точка А(5;-1,5) прямой MN ?
//            7*5+5*(-1,5)+1=0
//            35-7,5+1=0
//            28,6 не равно нулю, значит точка А не принадлежит MN.
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        if (!point1.equals(line.point1)) return false;
        return point2.equals(line.point2);

    }

    @Override
    public int hashCode() {
        int result = point1.hashCode();
        result = 31 * result + point2.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Line(" + point1 + "; " + point2 + ')';
    }
}

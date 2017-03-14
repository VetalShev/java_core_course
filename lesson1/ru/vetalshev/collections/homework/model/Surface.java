package ru.vetalshev.collections.homework.model;

import java.util.HashSet;
import java.util.Set;

public class Surface {

    private Set<Point> pointList = new HashSet<>();
    private Set<Line> lineList = new HashSet<>();

    public Surface() {
    }

//    public Surface(Set<Point> pointList) {
//        this.pointList = pointList;
//    }

    public void add(Point point) { // addPoint
//        // TODO: правильно ли так делать?
//        if (pointList == null) {
//            pointList = new HashSet<>();
//        }

        if (point == null) {
            throw new IllegalArgumentException("point can't be null");
//            return false;
        }

        pointList.add(point);

//        return true;
    }

    // TODO: нормально ли использовать перегруженные методы в данном случае?
    public boolean add(Line line) { // addLine

        if (line == null) {
            return false;
        }

        lineList.add(line);

        return true;
    }

    @Override
    public String toString() {
        return "Surface{" +
                "pointList=" + pointList +
                ", lineList=" + lineList +
                '}';
    }

    public Set<Line> getLineList() {
        return lineList;
    }

    public Set<Point> getPointList() {
        return pointList;
    }
}

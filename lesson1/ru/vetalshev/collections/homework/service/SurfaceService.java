package ru.vetalshev.collections.homework.service;

import ru.vetalshev.collections.homework.model.Line;
import ru.vetalshev.collections.homework.model.Point;

public class SurfaceService {

    public SurfaceService() {
    }

    // TODO: может стоит вынести метод в класс Point??? e.g. line.contains(Point):boolean
    public boolean belongPointToLine(Point point, Line line) {

        float vectorX = line.getPoint2().getX() - line.getPoint1().getX();
        float vectorY = line.getPoint2().getY() - line.getPoint1().getY();

        Point linePoint1 = line.getPoint1();
        Point linePoint2 = line.getPoint2();

        return ((point.getX() - linePoint1.getX()) / vectorX == (point.getY() - linePoint1.getY()) / vectorY);
    }


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

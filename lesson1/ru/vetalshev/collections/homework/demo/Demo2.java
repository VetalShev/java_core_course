package ru.vetalshev.collections.homework.demo;

import ru.vetalshev.collections.homework.model.Line;
import ru.vetalshev.collections.homework.model.Point;
import ru.vetalshev.collections.homework.model.Surface;
import ru.vetalshev.collections.homework.generator.PointGenerator;
import ru.vetalshev.collections.homework.generator.PointGeneratorImpl;

import java.util.HashMap;
import java.util.Map;

// На плоскости задано N точек. Вывести в файл описания всех прямых, которые
// проходят более чем через одну точку из заданных. Для каждой прямой
// указать, через сколько точек она проходит. Использовать класс HashMap.
public class Demo2 {

    public static void main(String[] args) {
        Surface surface = new Surface();
        PointGenerator pointGenerator = new PointGeneratorImpl(0, 100);

        for (int i = 0; i < 5; i++) {
            surface.addPoint(pointGenerator.generate());
        }

        surface.addPoint(new Point(0,0));
        surface.addPoint(new Point(1,0));
        surface.addPoint(new Point(0,1));
        surface.addPoint(new Point(5,5));
        surface.addPoint(new Point(0,5));
        surface.addPoint(new Point(5,0));
        surface.addPoint(new Point(2,2));
        surface.addPoint(new Point(6,7));
        surface.addPoint(new Point(1,5));
        surface.addPoint(new Point(5,1));
        surface.addPoint(new Point(1,1));

        surface.addLine(new Line(pointGenerator.generate(), pointGenerator.generate()));

        for (int i = 0; i < 5; i++) {
            Point p1 = pointGenerator.generate();
            Point p2 = pointGenerator.generate();
            Line line = new Line(p1, p2);
            surface.addLine(line);
        }

        surface.addLine(new Line(new Point(0,0), new Point(10,10)));
        surface.addLine(new Line(new Point(0,0), new Point(10,0)));
        surface.addLine(new Line(new Point(0,0), new Point(0,10)));
        surface.addLine(new Line(new Point(1,1), new Point(1,10)));
        surface.addLine(new Line(new Point(1,1), new Point(10,1)));
        surface.addLine(new Line(new Point(2,1), new Point(10,2)));
        surface.addLine(new Line(new Point(2,1), new Point(2,10)));
        surface.addLine(new Line(new Point(7,7), new Point(1,4)));
        surface.addLine(new Line(new Point(3,4), new Point(8,8)));
        surface.addLine(new Line(new Point(1,1), new Point(5,7)));

        Map<Line, Integer> map = new HashMap<>();

        for (Line line : surface.getLineList()) {
            int i = 0;

            for (Point point : surface.getPointList()) {
                boolean isBelong = line.contains(point);

                if (isBelong) {
                    i++;
                }
            }

            map.put(line, i);
        }

        System.out.println("========");
        for (Map.Entry<Line, Integer> item : map.entrySet()) {
            System.out.println(item.getKey() + ": " + item.getValue());
        }
        System.out.println("========");

    }

}

package ru.vetalshev.shapes.structure.right;

import ru.vetalshev.shapes.structure.right.action.IShapeAction;
import ru.vetalshev.shapes.structure.right.action.RectangleAction;
import ru.vetalshev.shapes.structure.right.action.TriangleAction;
import ru.vetalshev.shapes.structure.right.entity.Rectangle;
import ru.vetalshev.shapes.structure.right.entity.Triangle;

import static java.lang.Math.PI;

public class ShapeApp {

    public static void main (String[] args) {

        IShapeAction action;

        // нужна ли тут вообще конструкция try..catch ??? по идее, она нужна была только в предыдущем примере, верно ???
        try {
            Rectangle rectShape = new Rectangle(5, 7);
            action = new RectangleAction();
            System.out.println("Square rectangle: " + action.computeSquare(rectShape));
            System.out.println("Perimeter rectangle: " + action.computePerimeter(rectShape));

            Triangle trShape = new Triangle(8, 5, PI / 6);
            action = new TriangleAction();
            System.out.println("Square triangle: " + action.computeSquare(trShape));
            System.out.println("Perimeter triangle: " + action.computePerimeter(trShape));
//            action.computePerimeter(rectShape); // ошибка компиляции
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }

    }

}

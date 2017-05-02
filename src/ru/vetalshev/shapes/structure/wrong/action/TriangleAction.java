package ru.vetalshev.shapes.structure.wrong.action;

import ru.vetalshev.shapes.structure.wrong.entity.AbstractShape;
import ru.vetalshev.shapes.structure.wrong.entity.Triangle;

public class TriangleAction implements IShapeAction {

    @Override
    public double computeSquare(AbstractShape shape) {
        double square = 0;
        if (shape instanceof Triangle) {
            Triangle triangle = (Triangle) shape;

            // в чем отличие между следющими строками ??? [RESOLVED]

//            square = 1 / 2 * triangle.getA() * triangle.getB()
//                    * Math.sin(triangle.getAngle());

            // и

            square = triangle.getA() * triangle.getB() * 1 / 2
                    * Math.sin(triangle.getAngle());
        } else {
            throw new IllegalArgumentException("Incompatible shape: "
                    + shape.getClass());
        }
        return square;
    }

    @Override
    public double computePerimeter(AbstractShape shape) {
        double perimeter = 0;
        if (shape instanceof Triangle) {
            Triangle triangle = (Triangle) shape;
            perimeter = triangle.getA() + triangle.getB() + triangle.getC();
        } else {
            throw new IllegalArgumentException("Incompatible shape: "
                    + shape.getClass());
        }
        return perimeter;
    }
}
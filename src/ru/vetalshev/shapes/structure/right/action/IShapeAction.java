package ru.vetalshev.shapes.structure.right.action;

import ru.vetalshev.shapes.structure.right.entity.AbstractShape;

public interface IShapeAction <T extends AbstractShape> {

    double computeSquare(T shape);
    double computePerimeter(T shape);

}

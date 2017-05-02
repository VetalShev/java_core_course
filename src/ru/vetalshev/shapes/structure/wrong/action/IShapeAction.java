package ru.vetalshev.shapes.structure.wrong.action;

import ru.vetalshev.shapes.structure.wrong.entity.AbstractShape;

public interface IShapeAction extends ILineGroupAction {

    double computeSquare(AbstractShape shape);

}

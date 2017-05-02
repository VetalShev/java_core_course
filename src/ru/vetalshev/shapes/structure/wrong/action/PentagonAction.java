package ru.vetalshev.shapes.structure.wrong.action;

import ru.vetalshev.shapes.structure.wrong.entity.AbstractShape;

public abstract class PentagonAction implements IShapeAction {

    @Override
    public double computePerimeter(AbstractShape shape) {
        return 0;
    }

}

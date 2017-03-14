package ru.vetalshev.collections.homework.generator;

import ru.vetalshev.collections.homework.model.Point;

import java.util.Random;

public class PointGeneratorImpl implements PointGenerator {

    private int MIN;
    private int MAX;

    public PointGeneratorImpl(int MIN, int MAX) {
        this.MIN = MIN;
        this.MAX = MAX;
    }

    public Point generate() {
        Random random = new Random();

        int x = random.nextInt(MAX - MIN + 1) + MIN;
        int y = random.nextInt(MAX - MIN + 1) + MIN;

        return new Point(x, y);
    }
}

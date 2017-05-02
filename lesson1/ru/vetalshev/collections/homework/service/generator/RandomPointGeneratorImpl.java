package ru.vetalshev.collections.homework.service.generator;

import ru.vetalshev.collections.homework.model.Point;

import java.util.Random;

public class RandomPointGeneratorImpl implements PointGenerator {

    private int min = 10;
    private int max = 10;

    public RandomPointGeneratorImpl() {
    }

    public RandomPointGeneratorImpl(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public Point generate() {
        Random random = new Random();

        int x = random.nextInt(max - min + 1) + min;
        int y = random.nextInt(max - min + 1) + min;

        return new Point(x, y);
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }
}

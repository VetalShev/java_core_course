package ru.vetalshev.thread.example10;

import java.util.Random;
import java.util.concurrent.Callable;

public class CalcCallable implements Callable<Number> {

    @Override
    public Number call() throws Exception {
        Number result = new Random().nextGaussian(); // имитация вычислений

        return result;
    }

}
package ru.vetalshev.thread.example12;

public class CalcThread extends Thread {

    private double start;
    private double finish;
    private double result;

    public CalcThread(double start, double finish) {
        this.start = start;
        this.finish = finish;
    }

    public void run() {
        result = factorial(start, finish);
    }

    public double getResult() {
        return result;
    }

    private static double factorial(double start, double finish) {

        if (start <= 0 || finish <= 0) {
            throw new IllegalArgumentException("Arguments should be positive values");
        }

        if (start == finish) {
            return finish;
        }

        double result = 1;

        for (double i = start; i <= finish; i++) {
            result *= i;
        }

        return result;
    }

}

package ru.vetalshev.thread.example12;

public class DifficultCalculationDemo {

    public static void main(String[] args) throws InterruptedException {

//        CalcThread t1 = new CalcThread(1, 1_999_999_999);
        CalcThread t1 = new CalcThread(1, 500_000_000);
        CalcThread t2 = new CalcThread(500_000_001, 1_000_000_000);
        CalcThread t3 = new CalcThread(1_000_000_001, 1_500_000_000);
        CalcThread t4 = new CalcThread(1_500_000_001, 1_999_999_999);

        long startTime = System.nanoTime();

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        long finishTime = System.nanoTime();
        double calcTime = (double) (finishTime - startTime) / 1_000_000_000;

        System.out.print("Calculation result: ");
//        System.out.println(t1.getResult() * t2.getResult() * t3.getResult() * t4.getResult());
        System.out.println(t1.getResult());
        System.out.println("Total calculation time: " + calcTime);

    }

}

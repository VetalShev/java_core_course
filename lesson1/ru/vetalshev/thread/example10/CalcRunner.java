package ru.vetalshev.thread.example10;

import java.util.concurrent.*;

public class CalcRunner {


    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        futureFunc(executor);
        System.out.println("=============");
        futureTaskFunc(executor);

        executor.shutdown();

    }

    public static void futureFunc(ExecutorService executor) {
        System.out.println("Future:");
        Future<Number> future = executor.submit(new CalcCallable());

        future.cancel(true);

        System.out.println("future isDone: " + future.isDone());
        System.out.println("future isCancelled: " + future.isCancelled());

        if (!future.isCancelled()) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

    public static void futureTaskFunc(ExecutorService executor) {
        System.out.println("FutureTask:");
        FutureTask<Number> futureTask = new FutureTask<>(new CalcCallable());
        executor.execute(futureTask);

//        future.cancel(true);

        System.out.println("future isDone: " + futureTask.isDone());
        System.out.println("future isCancelled: " + futureTask.isCancelled());

        if (!futureTask.isCancelled()) {
            try {
                System.out.println(futureTask.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }



}

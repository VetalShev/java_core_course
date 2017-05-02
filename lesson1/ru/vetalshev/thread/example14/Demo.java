package ru.vetalshev.thread.example14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {

    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(2);

        exec.execute(new InThread());
        exec.execute(new InThread());
        exec.execute(new InThread());
        exec.execute(new InThread());
        exec.execute(new InThread());
        exec.execute(new InThread());

        exec.shutdown();

        while (!exec.isTerminated()) {
        }
    }

}

class InThread implements Runnable {
    public void run() {
        System.out.println("running...");
    }
}
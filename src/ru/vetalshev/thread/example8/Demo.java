package ru.vetalshev.thread.example8;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo {

//    public volatile int x = 0;
    public AtomicInteger x = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {

        Demo demo = new Demo();
        MyTask myTask = new MyTask(demo);
        Thread t1 = new Thread(myTask);
        Thread t2 = new Thread(myTask);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(demo.x);
    }
}

class MyTask implements Runnable {

    Demo demo;

    public MyTask(Demo demo) {
        this.demo = demo;
    }


    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            demo.x.addAndGet(1);
//            demo.x++;
        }
    }
}
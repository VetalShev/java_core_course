package ru.vetalshev.thread.demo;

import ru.vetalshev.thread.PriorityThread;

public class PriorityDemo {

    public static void main(String[] args) {
        PriorityThread min = new PriorityThread("Min");
        PriorityThread max = new PriorityThread("Max");
        PriorityThread norm = new PriorityThread("Norm");

        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);
        norm.setPriority(Thread.NORM_PRIORITY);

        min.start();
        norm.start();
        max.start();
    }

}

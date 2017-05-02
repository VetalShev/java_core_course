package ru.vetalshev.thread.example16;

import java.util.Queue;

public abstract class AlternateTask implements Runnable {

    protected String name;
    private Queue<String> queue;

    public AlternateTask(String name, Queue<String> queue) {
        this.name = name;
        this.queue = queue;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            synchronized (queue) {
                while (!name.endsWith(queue.peek())) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        System.out.println(name + " is interrupted");
                        return;
                    }
                }

                mainWork();
                String headName = queue.poll();
                queue.add(headName);

                queue.notifyAll();
            }
        }
    }

    abstract void mainWork();
}

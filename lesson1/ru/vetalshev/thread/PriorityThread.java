package ru.vetalshev.thread;

public class PriorityThread extends Thread {

    public PriorityThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + " " + i);
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
                System.err.print(ex);
            }
        }

        System.out.println("Thread " + getName() + " finished.");
    }

}

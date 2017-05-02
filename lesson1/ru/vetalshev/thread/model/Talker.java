package ru.vetalshev.thread.model;

public class Talker extends Thread {

    public Talker(String name) {
        super(name);
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                System.err.print(ex);
            }

            System.out.println(getName() + " talking... ");
        }

        System.out.println(getName() + " stopped talking.");
//        System.out.println(getState());
    }
}

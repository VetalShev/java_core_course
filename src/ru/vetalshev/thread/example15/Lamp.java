package ru.vetalshev.thread.example15;

public class Lamp {
    private boolean turnedOn = false;

    public synchronized void turnOn() throws InterruptedException {
        while (turnedOn) {
            System.out.println(Thread.currentThread().getName() + " turned on");
            wait();
        }

        System.out.println("Turned off");

        turnedOn = true;
        notifyAll();
    }

    public synchronized void turnOff() throws InterruptedException {
        while (!turnedOn) {
            System.out.println(Thread.currentThread().getName() + " turned off");
            wait();
        }

        System.out.println(Thread.currentThread().getName() + " turned on");

        turnedOn = false;
        notifyAll();
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }
}
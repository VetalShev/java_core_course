package ru.vetalshev.thread.example15;

import java.util.Random;

public class Person extends Thread {
    Lamp lamp;

    public Person(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void run() {
        while (true) {
            try {

                Thread.sleep(new Random().nextInt(10_000 - 1_000 + 1) + 1_000);
                lamp.turnOn();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

package ru.vetalshev.thread.example6;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicDemo {

    private static final int BROKERS_NUMBER = 5;

    public static void main(String[] args) throws InterruptedException {
        Market market = new Market(new AtomicLong(100));
        market.start();

        for (int i = 0; i < BROKERS_NUMBER; i++) {
            new Broker(i, market).start();
        }

    }

}

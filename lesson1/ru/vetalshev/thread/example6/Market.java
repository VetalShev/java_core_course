package ru.vetalshev.thread.example6;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class Market extends Thread {

    private AtomicLong index;
    private static final int LIMIT_MARKET_TIME = 5;

    public Market(AtomicLong index) {
        this.index = index;
    }

    public AtomicLong getIndex() {
        if (getState() == Thread.State.TERMINATED) { // when the market is closed
            return null;
        }

        return index;
    }

    @Override
    public void run() {
        Random random = new Random();
        long startTime = System.nanoTime();
        long endTime;

        try {
            while (true) {
                index.addAndGet(random.nextInt(10));
                Thread.sleep(random.nextInt(500));
                index.addAndGet(-1 * random.nextInt(10));
                Thread.sleep(random.nextInt(500));

                // just to limit broker time of work on the market
                endTime = System.nanoTime();
                if ((double) (endTime - startTime) / 1000000000 > LIMIT_MARKET_TIME) {
                    break;
                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
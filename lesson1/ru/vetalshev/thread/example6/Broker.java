package ru.vetalshev.thread.example6;

public class Broker extends Thread {

    private int key;
    private Market market;
    private static final int PAUSE = 500;
    private static final int BROKER_TIME_LIMIT = 10;

    public Broker(int key, Market market) {
        this.key = key;
        this.market = market;
    }

    @Override
    public void run() {
        long startTime = System.nanoTime();
        long endTime;

        try {
            while (true) {
                System.out.println("Current index (Broker#" + key + "): " + market.getIndex());
                Thread.sleep(PAUSE);

                // just to limit broker time of work on the market
                endTime = System.nanoTime();
                if ((double)(endTime - startTime) / 1000000000 > BROKER_TIME_LIMIT) {
                    System.out.println("Broker#" + key + " finished his working on the market.");
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

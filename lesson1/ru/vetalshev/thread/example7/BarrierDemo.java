package ru.vetalshev.thread.example7;

import java.util.Random;

public class BarrierDemo {

    public static void main(String[] args) {
        Auction auction = new Auction();
        int startPrice = new Random().nextInt(100);

        for (int i = 0; i < Auction.BIDS_NUMBER; i++) {
            Bid thread = new Bid(i, startPrice, auction.getBarrier());
            auction.add(thread);
            thread.start();
        }
    }
}

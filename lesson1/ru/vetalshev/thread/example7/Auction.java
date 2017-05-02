package ru.vetalshev.thread.example7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CyclicBarrier;

public class Auction {

    private ArrayList<Bid> bids;
    private CyclicBarrier barrier;

    public static final int BIDS_NUMBER = 5;

    public Auction() {
        this.bids = new ArrayList<>();
        this.barrier = new CyclicBarrier(BIDS_NUMBER, new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Bid winner = defineWinner();
                System.out.println("Bid #" + winner.getBidId() + ", price:" + winner.getPrice() + " win!");
            }
        });
    }

    public CyclicBarrier getBarrier() {
        return barrier;
    }

    public boolean add(Bid e) {
        return bids.add(e);
    }

    public Bid defineWinner() {
        return Collections.max(bids, new Comparator<Bid>() {
            @Override
            public int compare(Bid ob1, Bid ob2) {
                return ob1.getPrice() - ob2.getPrice();
            }
        });
    }

}

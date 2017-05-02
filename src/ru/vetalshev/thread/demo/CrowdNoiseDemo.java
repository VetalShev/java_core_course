package ru.vetalshev.thread.demo;

import ru.vetalshev.thread.model.Talker;

import java.util.ArrayList;
import java.util.List;

public class CrowdNoiseDemo {

    public static void main(String[] args) {


        Runnable talkTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
//
                    System.out.println("tick " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();

                        throw new RuntimeException(e);
                    }
                }
            }
        };


        Thread myThread = new Thread(talkTask, "vetalshev");


        myThread.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myThread.interrupt();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myThread.interrupt();


        /*List<Talker> talkersList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            Talker talker = new Talker("User " + i);

            talkersList.add(talker);
        }


        for (Talker talker : talkersList) {
//            System.out.println(talker.getName() + " " + talker.getState());
            talker.start();
//            System.out.println(talker.getName() + " " + talker.getState());
        }
*/
    }
}

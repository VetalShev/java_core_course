package ru.vetalshev.thread.example16;


import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("person1");
        queue.add("person2");
        queue.add("person3");

        Thread person1 = new Thread(new ShoutTask("person1", queue));
        Thread person2 = new Thread(new ShoutTask("person2", queue));
        Thread person3 = new Thread(new ShoutTask("person3", queue));

        person1.start();
        person2.start();
        person3.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        person1.interrupt();
        person2.interrupt();
        person3.interrupt();
    }
}

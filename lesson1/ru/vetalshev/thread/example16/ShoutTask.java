package ru.vetalshev.thread.example16;

import java.util.Queue;

public class ShoutTask extends AlternateTask {

    public ShoutTask(String name, Queue<String> queue) {
        super(name, queue);
    }

    @Override
    void mainWork() {
        System.out.println(name);
    }
}

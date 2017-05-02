package ru.vetalshev.thread;

public class JoinThread extends Thread {

    public JoinThread(String name) {
        super(name);
    }



    public void run() {
        long timeout = 0;

        System.out.println("---" + Thread.currentThread().getName());

        System.out.println("Старт потока " + getName());

        try {
            switch (getName()) {
                case "First":
                    timeout = 2_000;
                    break;
                case "Second":
                    timeout = 1_000;
            }

            Thread.sleep(timeout);

            System.out.println("завершение потока " + getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
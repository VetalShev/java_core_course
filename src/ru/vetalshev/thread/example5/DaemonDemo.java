package ru.vetalshev.thread.example5;

public class DaemonDemo {

    public static void main(String[] args) throws InterruptedException {
        SimpleThread usual = new SimpleThread();
        SimpleThread daemon = new SimpleThread();

        daemon.setDaemon(true);
//        usual.setDaemon(true);

        daemon.start();
        usual.start();

        System.out.println("последний оператор main");
    }

}

package ru.vetalshev.thread.example5;

public class SimpleThread extends Thread {
    public void run() {
        try {
            if (isDaemon()) {
                Thread.sleep(1_000); // закомментировать
                System.out.println("старт потока-демона");
            } else {
                System.out.println("старт обычного потока");
            }
        } catch (Exception e) {
            System.err.print(e);
        } finally {
            if (!isDaemon()) {
                System.out.println("завершение обычного потока");
            } else {
                System.out.println("завершение потока-демона");
            }
        }
    }
}

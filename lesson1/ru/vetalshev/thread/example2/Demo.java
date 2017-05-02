package ru.vetalshev.thread.example2;

public class Demo {

    public static int counter = 0;

    public static void main(String args[]) {

        final StringBuilder s = new StringBuilder();

        try {
            Thread t1 = new Thread() {
                public void run() {
                    synchronized (s) {
                        do {
                            s.append("A");
                            System.out.println(s);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                System.err.print(e);
                            }
                        } while (Demo.counter++ < 2);
                    } // конец synchronized
                }
            };

            Thread t2 = new Thread() {
                public void run() {
                    synchronized (s) {
                        while (Demo.counter++ < 6) {
                            s.append("B");
                            System.out.println(s);
//                            try {
//                                Thread.sleep(1000);
//                            } catch (InterruptedException e) {
//                                System.err.print(e);
//                            }
                        }
                    } // конец synchronized
                }
            };

            t1.start();
            t2.start();
            t1.join();
            t2.join();

        } catch (Exception ex) {
            throw new RuntimeException();
            // TODO: почему здесь нельзя вызвать throw new InterruptedException(); ??? [RESOLVED]
//            System.err.print("Thread error: " + ex);
        }

        System.out.println("Main thread");

    }
}

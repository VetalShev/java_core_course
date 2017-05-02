package ru.vetalshev.thread.example3;

public class BuilderBufferDemo {

    static int counter = 0;
    static StringBuilder s = new StringBuilder(); // заменить на StringBuilder
    static Object obj = new Object();

    public static void main(String[] args) {

        new Thread() {
            public void run() {
                synchronized (obj) {
                    while (BuilderBufferDemo.counter++ < 3) {
                        s.append("A");
                        System.out.print("> " + counter + " ");
                        System.out.println(s);
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException ex) {
                            System.err.print(ex);
                        }
                    }
                } // конец synchronized-блока
            }
        }.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            System.err.print(ex);
        }

        while (BuilderBufferDemo.counter++ < 6) {
            System.out.print("< " + counter + " ");
            // в этом месте поток main будет ждать освобождения блокировки объекта s
            s.append("B");
            System.out.println(s);
        }
    }

}

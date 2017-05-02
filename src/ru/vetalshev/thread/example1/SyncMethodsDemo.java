package ru.vetalshev.thread.example1;

import java.io.IOException;

public class SyncMethodsDemo {

    public static void main(String[] args) {
        Resource s = null;

        try {
            s = new Resource("src/ru/vetalshev/thread/example1/threadDemo.txt");

            SyncThread t1 = new SyncThread("First", s);
            SyncThread t2 = new SyncThread("Second", s);

            t1.start();
            t2.start();

//            while (t1.isAlive()) {
//                System.out.println(t1.getName() + " " + t1.getState() + " isAlive:" + t1.isAlive());
//                System.out.println(t2.getName() + " " + t2.getState() + " isAlive:" + t1.isAlive());
//                Thread.sleep(500);
//            }

//            System.out.println(t1.getName() + " " + t1.getState() + " isAlive:" + t1.isAlive());
//            System.out.println(t2.getName() + " " + t2.getState() + " isAlive:" + t1.isAlive());

            // приостанавливаем поток для того, чтобы файл не был закрыт в блоке finally
            // пока с ним работают потоки
            t1.join(); // приостанавливаем работу основного потока, т.е. поток main продолжит работу только после окончания выполнения потокая t1
            t2.join(); // приостанавливаем работу основного потока, т.е. поток main продолжит работу только после окончания выполнения потокая t2

        } catch (IOException e) {
            System.err.print("File error: " + e);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            s.close();
        }
    }

}

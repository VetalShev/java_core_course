package ru.vetalshev.thread.example1;

public class SyncThread extends Thread {

    private Resource rs;

    public SyncThread(String name, Resource rs) {
        super(name);

        System.out.println("CONSTRUCTOR: " + getName() + " " + getState() + " isAlive:" + isAlive());
        this.rs = rs;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + " " + getState() + " isAlive:" + isAlive());
            rs.writing(getName(), i); // место срабатывания синхронизации
        }
    }
}
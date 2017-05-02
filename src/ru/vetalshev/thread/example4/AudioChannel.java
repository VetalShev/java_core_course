package ru.vetalshev.thread.example4;

public class AudioChannel {

    private int сhannellId;

    public AudioChannel(int id) {
        super();
        this.сhannellId = id;
    }

    public int getСhannellId() {
        return сhannellId;
    }

    public void setСhannellId(int id) {
        this.сhannellId = id;
    }

    public void using() {
        try {
            // использование канала
            Thread.sleep(new java.util.Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
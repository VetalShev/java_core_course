package ru.vetalshev.thread.example13;

public class ExchangerDemo {

    public static void main(String[ ] args) {
        Item ss1 = new Item(34, 2000);
        Item ss2 = new Item(34, 1000);

        new Thread(new Producer("ACER", ss1)).start();
        new Thread(new Consumer("ULMART", ss2)).start();
    }

}

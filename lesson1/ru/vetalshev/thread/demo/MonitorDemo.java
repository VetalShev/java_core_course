package ru.vetalshev.thread.demo;

import ru.vetalshev.thread.model.Payment;

public class MonitorDemo {

    public static void main(String[] args) throws InterruptedException {
        final Payment payment = new Payment();

        new Thread() {
            public void run() {
                payment.doPayment(); // вызов synchronized метода
            }
        }.start();

        Thread.sleep(2000);

        synchronized (payment) { // 1-ый блок
            System.out.println("Init amount:");
            payment.initAmount();
            payment.notify(); // уведомление о возврате блокировки
        }
        synchronized (payment) { // 2-ой блок
            payment.wait(1_000);
            System.out.println("ok");
        }
    }

}

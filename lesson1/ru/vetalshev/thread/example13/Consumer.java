package ru.vetalshev.thread.example13;

public class Consumer extends Subject implements Runnable {

    public Consumer(String name, Item item) {
        super(name, item);
    }

    public void run() {
        System.out.println(getName() + ": RUN");
        try {
            synchronized (item) { // блок синхронизации не нужен, но показателен
                System.out.println(getName() + ": enter synchronized block");
                int requiredNumber = item.getNumber();
                System.out.println(getName() + " requiredNumber: " + requiredNumber);

                item = exchanger.exchange(item); // обмен
                System.out.println(getName() + ": " + getItem());
                System.out.println("====================");

                if (requiredNumber >= item.getNumber()) {
                    System.out.println("Consumer " + getName()
                            + " повышает стоимость товара");
                } else {
                    System.out.println("Consumer " + getName()
                            + " снижает стоимость товара");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

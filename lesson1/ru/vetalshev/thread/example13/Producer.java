package ru.vetalshev.thread.example13;

public class Producer extends Subject implements Runnable {

    public Producer(String name, Item item) {
        super(name, item);
    }

    public void run() {
        System.out.println(getName() + ": RUN");
        try {
            synchronized(item) { // блок синхронизации не нужен, но показателен
                System.out.println(getName() + ": enter synchronized block");
                int proposedNumber = this.getItem().getNumber();
                System.out.println(getName() + " proposedNumber: " + proposedNumber);

                // обмен синхронизированными экземплярами
                item = exchanger.exchange(item);
                System.out.println(getName() + ": " + getItem());
                System.out.println("====================");

                if (proposedNumber <= item.getNumber()) {
                    System.out.println("Producer " + getName()
                            + " повышает план производства товара");
                } else {
                    System.out.println("Producer " + getName()
                            + " снижает план производства товара");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


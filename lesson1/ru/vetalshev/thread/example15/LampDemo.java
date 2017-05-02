package ru.vetalshev.thread.example15;

public class LampDemo {

    public static void main(String[] args) {
        Lamp lamp = new Lamp();

        Person person1 = new Person(lamp);
        Person person2 = new Person(lamp);
        Person person3 = new Person(lamp);

        person1.start();
        person2.start();
        person3.start();
    }

}

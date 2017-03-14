package ru.vetalshev.collections.homework.demo;

import ru.vetalshev.collections.homework.service.RemoveEvenCircleService;

import java.text.DecimalFormat;
import java.util.*;

// В кругу стоят N человек, пронумерованных от 1 до N. При ведении счета
// по кругу вычеркивается каждый второй человек, пока не останется один.
// Составить две программы, моделирующие процесс. Одна из программ
// должна использовать класс ArrayList, а вторая — LinkedList. Какая из двух
// программ работает быстрее? Почему?
public class Demo1 {

    public static void main(String[] args) {

        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list1.add(i);
            list2.add(i);
        }

        RemoveEvenCircleService<Integer> removeEvenCircleService1 = new RemoveEvenCircleService<>(list1);
        RemoveEvenCircleService<Integer> removeEvenCircleService2 = new RemoveEvenCircleService<>(list2);

        long startTimeLinkedList = System.nanoTime();

        removeEvenCircleService1.start();

        long endTimeLinkedList = System.nanoTime();

        System.out.println("=======================");
        System.out.println("Linked List:");
        System.out.println("Time start: " + startTimeLinkedList);
        System.out.println("Time end: " + endTimeLinkedList);
        System.out.println("Diff: " + ((double)(endTimeLinkedList - startTimeLinkedList) / 1000000000) + " sec");

        long startTimeArrayList = System.nanoTime();

        removeEvenCircleService2.start();

        long endTimeArrayList = System.nanoTime();

        System.out.println("=======================");
        System.out.println("Array List:");
        System.out.println("Time start: " + startTimeArrayList);
        System.out.println("Time end: " + endTimeArrayList);
        System.out.println("Diff: " + ((double)(endTimeArrayList - startTimeArrayList) / 1000000000) + " sec");

    }

}

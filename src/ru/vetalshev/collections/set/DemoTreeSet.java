package ru.vetalshev.collections.set;

import java.util.*;

public class DemoTreeSet {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        System.out.println("List:");
        for (int i = 0; i < 6; i++) {
            list.add((int) (Math.random() * 10) + "Y");
        }
        System.out.println(list);

        System.out.println("TreeSet:");
        TreeSet<String> set = new TreeSet( list );
//        new TreeSet<>();
        System.out.println(set);

        // извлечение наибольшего и наименьшего элементов
        System.out.println("============");
        System.out.println("Min: " + set.first());
        System.out.println("Max: " + set.last());
        System.out.println("============");

        HashSet<String> hSet = new HashSet<>(set);
        for (String str : hSet) {
            System.out.println(str + "hashCode: " + str.hashCode());
        }
    }
}
package ru.vetalshev.collections.set;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        HashSet<Integer> words = new HashSet<>(100);

//        for (int i = 0; i < 10; i++) {
//            words.add((int) (Math.random() * 100));
//        }

        words.add(85);
        words.add(11);
        words.add(134);
        words.add(1025);
        words.add(-18);
        words.add(76);
        words.add(-47);

        Iterator<Integer> it = words.iterator();

        while (it.hasNext()) {
            Integer val = it.next();
            System.out.println(val + " hashCode: " + val.hashCode());
        }

        TreeSet<Integer> ts = new TreeSet<>(new MyIntegerComparator());

        ts.addAll(words);

        System.out.println(ts);
    }
}

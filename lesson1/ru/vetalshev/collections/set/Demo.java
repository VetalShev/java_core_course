package ru.vetalshev.collections.set;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        HashSet<IntegerWrapper> words = new HashSet<>(100);

//        for (int i = 0; i < 10; i++) {
//            words.add(new IntegerWrapper((int) (Math.random() * 100)));
//        }

        words.add(new IntegerWrapper(85));
        words.add(new IntegerWrapper(11));
        words.add(new IntegerWrapper(134));
        words.add(new IntegerWrapper(1025));
        words.add(new IntegerWrapper(-18));
        words.add(new IntegerWrapper(76));
        words.add(new IntegerWrapper(-47));

        Iterator<IntegerWrapper> it = words.iterator();

        while (it.hasNext()) {
            IntegerWrapper val = it.next();
            System.out.println(val + " hashCode: " + val.hashCode());
        }

        TreeSet<IntegerWrapper> ts = new TreeSet<>(words);
        System.out.println(ts);
    }
}

package ru.vetalshev.collections.set;

import java.util.*;

public class DemoHashSet {

    public static void main(String[] args) {

        HashSet<String> words = new HashSet<>(100);
//        Scanner scan = new Scanner(System.in);
//        int i = 0;
//
//        try {
//            while (i < 10) {
//                String word = scan.next();
//                words.add(word.toLowerCase());
//                i++;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        words.add("my");
        words.add("name");
        words.add("is");
        words.add("vitalii");
        words.add("shevchenko");
        words.add("I");
        words.add("am");
        words.add("25");
        words.add("I");
        words.add("am");
        words.add("a");
        words.add("Java");
        words.add("developer");

        Iterator<String> it = words.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        TreeSet<String> ts = new TreeSet<>(words);
        System.out.println(ts);
        System.out.println("Различных слов: " + words.size());
    }
}

package ru.vetalshev.collections.some;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<PK, String> cache = new HashMap<>();

        cache.put(new PK("x1"), "xxx1");
        cache.put(new PK("x2"), "xxx2");
        cache.put(new PK("x3"), "xxx3");
        cache.put(new PK("x4"), "xxx4");
        cache.put(new PK("x5"), "xxx5");

        PK pk = new PK("x3");

        cache.get(pk);

        System.out.println(cache.containsKey(pk));


    }
}

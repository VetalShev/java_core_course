package ru.vetalshev.collections.hash;

import java.util.*;

public class DemoHashMap {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Сырок", 3);
        map.put("Пряник", 5);
        map.put("Молоко", 1);
        map.put("Хлеб", 1);
        map.put("Бублики", 1);

        System.out.println(map);

        map.put("Пряник", 4); // замена или добавление при отсутствии ключа

        Integer a = map.get("Хлеб");
        System.out.println(a + " - найден по ключу 'Хлеб'");

        // вывод хэш-таблицы с помощью методов интерфейса Map.Entry<K,V>
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        System.out.println(entrySet);

        System.out.println("Ключи:");
        Collection<Integer> values = map.values();
        System.out.println(values);

        System.out.println("Значения:");
        Collection<String> keys = map.keySet();
        System.out.println(keys);

        System.out.println("=========================");

//        TODO(vetalshev): какой из переборов по hashMap лучше всего использовать?

//        TODO(vetalshev): №1 перебор через итератор
        System.out.println("№1 перебор через итератор");
        Iterator<Map.Entry<String, Integer>> i = entrySet.iterator();
        while (i.hasNext()) {
//            map.put("XXXXXXXX", 4); // emulate ConcurrentModificationException
            Map.Entry<String, Integer> me = i.next();
            System.out.println("Key = " + me.getKey() + ", Value = " + me.getValue());
        }

//        TODO(vetalshev): №2 перебор через keySet
        System.out.println("№2 перебор через keySet");
        for (String key : map.keySet()) {
//            map.put("XXXXXXXX", 4); // emulate ConcurrentModificationException
            Integer value = map.get(key);
            System.out.println("Key = " + key + ", Value = " + value);
        }

//        TODO(vetalshev): №3 перебор через entrySet
        System.out.println("№3 перебор через entrySet");
        for (Map.Entry<String, Integer> e : entrySet) {
//            map.put("XXXXXXXX", 4); // emulate ConcurrentModificationException
            System.out.println("Key = " + e.getKey() + ", Value = " + e.getValue());
        }

    }
}
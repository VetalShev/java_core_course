package ru.vetalshev.collections.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Задан файл с текстом на английском языке. Выделить все различные слова.
// Для каждого слова подсчитать частоту его встречаемости.
// Слова, отличающиеся регистром букв, считать различными. Использовать класс HashMap.
public class Demo {

    public static void main(String[] args) {

        String file = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
//        String file = "Lorem Ipsum is simply dummy text. Lorem Ipsum Lorem Ipsum.";

        HashMap<String, Integer> wordsMap = new HashMap<>();

        String[] words = file.split("\\W+");

//        int index = 0;
//        for (String word : words) {
//            System.out.println(index + ": " + word);
//            index++;
//        }

        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();

            if (wordsMap.containsKey(lowerCaseWord)) {
                int totalCount = wordsMap.get(lowerCaseWord);
                int newCount = totalCount + 1;

                wordsMap.put(lowerCaseWord, newCount);
            } else {
                wordsMap.put(lowerCaseWord, 1);
            }
        }

        for (Map.Entry<String, Integer> word : wordsMap.entrySet()) {
            System.out.println(word.getKey() + ": " + word.getValue());
        }

        System.out.println("=================");
        System.out.println("MAP SIZE: " + wordsMap.size());
        System.out.println("=================");

    }

}

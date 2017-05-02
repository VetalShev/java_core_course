package ru.vetalshev.chapter1.numbers;

import java.util.List;

public class Printer {

    public void print(List<Integer> numberList) {

        if (numberList.size() == 0) {
            System.out.println("The list is empty");
        } else {
            for (int number : numberList) {
                System.out.println(number);
            }
        }

        System.out.println("==============");
    }

}

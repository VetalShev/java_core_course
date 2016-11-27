package ru.vetalshev.chapter1.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class FibonacciRow {

    public List<Integer> getRow(int number) {

        List<Integer> fibonacciRow = new ArrayList<>();

        if (number > 0) {
            fibonacciRow.add(1);

            for (int i = 1; i < number; i++) {
                int prevNumberIndex = i - 1;
                int prevPrevNumberIndex = i - 2;

                Integer prevNumber = null; // IDE пишет, что присвоение значения null redundant. Так ли это? Имеет ли такая запись смысл?
                Integer prevPrevNumber = null;

                Integer nextFibonacciNumber = null;

                if (prevNumberIndex < 0) {
                    prevNumber = 0;
                } else {
                    prevNumber = fibonacciRow.get(prevNumberIndex);
                }

                if (prevPrevNumberIndex < 0) {
                    prevPrevNumber = 0;
                } else {
                    prevPrevNumber = fibonacciRow.get(prevPrevNumberIndex);
                }

                nextFibonacciNumber = prevNumber + prevPrevNumber;

                fibonacciRow.add(nextFibonacciNumber);
            }
        } else {
            System.out.println("Type positive value!");
        }

        return fibonacciRow;
    }

}

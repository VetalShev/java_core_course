package ru.vetalshev.chapter1.numbers;

import java.util.ArrayList;
import java.util.List;

public class ListNumberUtils {

    private List<Integer> numbers = new ArrayList<>();

    public ListNumberUtils(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getEven() {
        List<Integer> evenList = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenList.add(number);
            }
        }

        return evenList;
    }

    public List<Integer> getOdd() {
        List<Integer> oddList = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 != 0) {
                oddList.add(number);
            }
        }

        return oddList;
    }

    public int getLargest() {
        int largestNumber = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largestNumber) {
                largestNumber = number;
            }
        }

        return largestNumber;
    }

    public int getSmallest() {
        int largestNumber = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < largestNumber) {
                largestNumber = number;
            }
        }

        return largestNumber;
    }

}

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

    public List<Integer> getEven(int divider) {
        List<Integer> dividedOnDividerList = new ArrayList<>();

        for (int number : numbers) {
            if (number % divider == 0) {
                dividedOnDividerList.add(number);
            }
        }

        return dividedOnDividerList;
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

    public List<Integer> getInDescendingOrder() {
        List<Integer> list = new ArrayList<>();

        // copy base array to temporary (to prevent base array modifications)
        for (int item : numbers) {
            list.add(item);
        }

        for (int i = 0, len = list.size() - 1; i < len; i++) {

            boolean isSwapped = false;
            int j = 0;

            while (j < len - i) {
                if (list.get(j) < list.get(j+1)) {
                    int temporary = list.get(j+1);
                    list.set(j+1, list.get(j));
                    list.set(j, temporary);
                    isSwapped = true;
                }
                j++;
            }

            if (!isSwapped) {
                break;
            }
        }

        return list;
    }

}

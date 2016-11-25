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

    public Integer getRequired(List<Integer> input, boolean flag) {
        if (input.size() == 0) {
            return null;
        }
        Integer result = input.get(0);

        for (Integer it : input) {
            if ((flag && result >= it) || (!flag && result <= it) ) {
                result = it;
            }
        }
        return result;
    }


    public int getSmallest() {
        int smallestNumber = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }

        return smallestNumber;
    }

    // Отсортированные числа в порядке возрастания и убывания
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
                if (list.get(j) < list.get(j + 1)) {
                    int temporary = list.get(j + 1);
                    list.set(j + 1, list.get(j));
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

    // Простые числа
    public List<Integer> getSimpleNumbers() {
        List<Integer> simpleNumberList = new ArrayList<>();

        for (int item : numbers) {
            if (isSimpleNumber(item)) {
                simpleNumberList.add(item);
            }
        }

        return simpleNumberList;

    }

    // Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
    public List<Integer> getThreeDigitNonRepeatingNumbers() {
        List<Integer> threeUniqueDigitNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number > 99 && number < 1000) {
                char[] chars = String.valueOf(number).toCharArray();

                for (int i = 0, len = chars.length; i < len; i++) {
                    boolean isDigitUnique = true;

                    for (int j = i + 1; j < len; j++) {
                        if (chars[i] == chars[j]) {
                            isDigitUnique = false;
                            break;
                        }
                    }

                    if (!isDigitUnique) {
                        break;
                    }

                    if (i == len - 1) {
                        threeUniqueDigitNumbers.add(number);
                    }
                }
            }
        }

        return threeUniqueDigitNumbers;
    }

    public boolean isSimpleNumber(int number) {
        boolean isSimple = true;

        if (number <= 1) {
            isSimple = false;
        } else if (number == 2) {
            isSimple = true;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isSimple = false;
                    break;
                }
            }
        }

        return isSimple;
    }

}

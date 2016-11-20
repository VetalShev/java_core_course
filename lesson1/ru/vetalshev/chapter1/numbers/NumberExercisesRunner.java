package ru.vetalshev.chapter1.numbers;

import java.util.ArrayList;
import java.util.List;

//Ввести с консоли n целых чисел. На консоль вывести:
// Четные и нечетные числа.
public class NumberExercisesRunner {

    public static void main(String[] args) {

//        NumbersGenerator numbersGenerator = new NumbersGenerator();
//        int[] numbers = numbersGenerator.generate(5);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(24);
        numbers.add(44);
        numbers.add(7);
        numbers.add(243);

        ListNumberUtils listNumberUtils = new ListNumberUtils(numbers);


        List<Integer> evenNumbers = listNumberUtils.getEven();

        System.out.println("Odd number list:");
        for (int evenNumber : evenNumbers) {
            System.out.println(evenNumber);
        }
        System.out.println("==============");

        List<Integer> oddNumbers = listNumberUtils.getOdd();

        System.out.println("Odd number list:");
        for (int oddNumber : oddNumbers) {
            System.out.println(oddNumber);
        }
        System.out.println("==============");


    }

}

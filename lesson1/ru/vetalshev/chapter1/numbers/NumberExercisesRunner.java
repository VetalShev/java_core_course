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
        Printer printer = new Printer();

        numbers.add(1);
        numbers.add(10);
        numbers.add(11);
        numbers.add(13);
        numbers.add(15);
        numbers.add(-2729);
        numbers.add(125);
        numbers.add(244);
        numbers.add(441);
        numbers.add(74123);
        numbers.add(243);

        ListNumberUtils listNumberUtils = new ListNumberUtils(numbers);


        List<Integer> evenNumbers = listNumberUtils.getEven();
        System.out.println("Odd number list:");
        printer.print(evenNumbers);

        List<Integer> oddNumbers = listNumberUtils.getOdd();
        System.out.println("Odd number list:");
        printer.print(oddNumbers);

        int largestNumber = listNumberUtils.getLargest();
        System.out.println("The largest number is: " + largestNumber);

        int smallestNumber = listNumberUtils.getSmallest();
        System.out.println("The smallest number is: " + smallestNumber);
        System.out.println("==============");

        List<Integer> multiplenessTo3List = listNumberUtils.getEven(3);
        System.out.println("Multipleness to 3:");
        printer.print(multiplenessTo3List);

        List<Integer> multiplenessTo9List = listNumberUtils.getEven(9);
        System.out.println("Multipleness to 9:");
        printer.print(multiplenessTo9List);

        List<Integer> descendingOrderList = listNumberUtils.getInDescendingOrder();
        System.out.println("List in descending order:");
        printer.print(descendingOrderList);

        List<Integer> simpleNumbersList = listNumberUtils.getSimpleNumbers();
        System.out.println("Simple numbers list:");
        printer.print(simpleNumbersList);

        List<Integer> threeUniqueDigitsNumbers = listNumberUtils.getThreeDigitNonRepeatingNumbers();
        System.out.println("Three-digit numbers where all the symbols is unique:");
        printer.print(threeUniqueDigitsNumbers);

    }

}

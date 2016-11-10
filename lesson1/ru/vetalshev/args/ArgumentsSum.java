package ru.vetalshev.args;

// Ввести целые числа как аргументы командной строки, подсчитать их суммы
// (произведения) и вывести результат на консоль.
public class ArgumentsSum {

    public static void main(String[] args) {

        int totalSum = 0;

        for (int i = 0; i < args.length; i++) {
            totalSum += Integer.parseInt(args[i]);
        }

        System.out.println("Total sum of arguments: " + totalSum);

    }
}
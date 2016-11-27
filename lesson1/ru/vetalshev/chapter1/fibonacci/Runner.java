package ru.vetalshev.chapter1.fibonacci;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        List<Integer> sequence = new ArrayList<>();
        FibonacciRow fibonacciRow = new FibonacciRow();

        System.out.println("Type fibonacci row length & press <Enter>:");
        Scanner scan = new Scanner(System.in);

        int fibonacciRowLength;

        while (true) {
            try {
                fibonacciRowLength = scan.nextInt();

                if (fibonacciRowLength > 0) {
                    break;
                } else {
                    System.out.println("Wrong format! Type positive value please.");
                }

            } catch (Exception ex) {
//                throw new InputMismatchException(ex.toString());
                System.out.println("Wrong format! Type the number please.");
            }
        }

        scan.close();

        sequence = fibonacciRow.getRow(fibonacciRowLength);

        System.out.println("Generating first " + fibonacciRowLength + " fibonacci row numbers...");
        for (int i = 0, len = sequence.size(); i < len; i++) {
            System.out.print(sequence.get(i));

            if (i < len - 1) {
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }

    }
}

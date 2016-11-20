package ru.vetalshev.random;

import java.util.Scanner;
import java.util.Random;

// Вывести заданное количество случайных чисел с переходом и без перехода
// на новую строку.
public class RandomRunner {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        Integer number;

        System.out.println("Type some random value & press <Enter>:");

        while (true) {
            try {
                number = Integer.parseInt(scan.next());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("===ERROR!===\n\rPlease type the number!");
            }
        }

        scan.close();

        for (int i = 0; i < number; i++) {
            int n = rand.nextInt(10000);
            System.out.println("Number #" + i + ": " + n);
        }
    }
}
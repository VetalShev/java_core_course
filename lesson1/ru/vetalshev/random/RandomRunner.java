package ru.vetalshev.random;

import java.util.Scanner;
import java.util.Random;

// Вывести заданное количество случайных чисел с переходом и без перехода
// на новую строку.
public class RandomRunner {

    public static void main(String[] args) {
        System.out.println("Type your name & press <Enter>:");

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        String number = scan.next();
        scan.close();

        for (int i = 0; i < Integer.parseInt(number); i++) {
            int n = rand.nextInt(10000);
            System.out.println("Number #" + i + ": " + n);
        }
    }
}
package ru.vetalshev.console;

import java.util.Scanner;

public class RunScanner {
    public static void main(String[] args) {
        System.out.println("Type your name & press <Enter>:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hi, " + name);
        scan.close();
    }
}
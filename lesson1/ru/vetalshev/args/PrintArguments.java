package ru.vetalshev.args;

public class PrintArguments {
    public static void main(String[] args) {
//        for (String str : args) {
//            System.out.printf("Argument -> %s%n", str);
//        }

//        for (int i = 0; i < args.length; i++) {
//            System.out.println("Argument[" + i + "] -> " + args[i]);
//        }

        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println("Argument[" + i + "] -> " + args[i]);
        }

    }
}
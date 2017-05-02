package ru.vetalshev.password;

import java.io.Console;

// Ввести пароль из командной строки и сравнить его со строкой-образцом.
public class PasswordConsoleRunner {

    public static void main(String[] args) {

        final String PASSWORD_SAMPLE = "vetalshev";

        Console console = null; // ??? почему сбилдилось, по идее должна быть ошибка типов [RESOLVED]
        String name = null;

        try {
            // creates a console object
            console = System.console(); // ??? почему System.console(), а не new Console(); [RESOLVED]

            if (console != null) {

                // read line from the user input
                name = console.readLine("Name: ");
                // read password into the char array
                char[] pwd = console.readPassword("Password: ");

                System.out.println("");

                System.out.println("Name is: " + name);
                System.out.println("Password is: " + String.valueOf(pwd)); // ??? почему нужно явно приведение типов [RESOLVED]

                System.out.println("");

                // TODO: сравнивать переменные нужно по значению, а не по ссылке
                if (PASSWORD_SAMPLE.equals(String.valueOf(pwd))) { // ??? почему всегда не совпадают [RESOLVED]
                    System.out.println("Typed password matches to Password template!");
                } else {
                    System.out.println("Typed password DOESN'T match to Password template!");
                }

            }
        } catch (Exception ex) { // ??? Exception это суперкласс для всех типов эксепшенов? [RESOLVED]
            ex.printStackTrace();
        }
    }
}
package ru.vetalshev.regex;

import java.io.Console;
import ru.vetalshev.regex.IPAddressValidator;

public class Runner {

    public static void main(String[] args) {

        Console console = null; // ??? почему сбилдилось, по идее должна быть ошибка типов [RESOLVED]
        IPAddressValidator ipAddressValidator = new IPAddressValidator();
        String ip = null;

        try {
            console = System.console();

            while (true) {
                ip = console.readLine("Type some IP address and press [Enter]: ");

                if (ipAddressValidator.isValid(ip)) {
                    System.out.println("IP address '" + ip + "' is correct");
                    break;
                } else {
                    System.out.println("It's not an IP address. Type one more time, please:");
                }

            }

        } catch (Exception ex) { // ??? Exception это суперкласс для всех типов эксепшенов? [RESOLVED]
            ex.printStackTrace();
        }
    }
}
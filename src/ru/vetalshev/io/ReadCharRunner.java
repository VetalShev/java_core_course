package ru.vetalshev.io;

public class ReadCharRunner {
    public static void main(String[] args) {
        int x;
        try {
            x = System.in.read();
            char c = (char) x;
            System.out.println("Symbol code: " + c + " =" + x);
        } catch (java.io.IOException e) {
            System.err.println("Error while typing: " + e);
        }
    }
}
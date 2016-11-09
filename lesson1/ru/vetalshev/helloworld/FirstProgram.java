package ru.vetalshev.helloworld;

import ru.vetalshev.helloworld.HelloWorld; // подключение класса из пакета

public class FirstProgram {
    public static void main(String[ ] args) {
        HelloWorld firstObject = new HelloWorld ();
        firstObject.printSlogan();
    }
}
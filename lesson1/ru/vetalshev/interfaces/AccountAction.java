package ru.vetalshev.interfaces;

public interface AccountAction {

    // по умолчанию все методы public abstract
    boolean openAccount(); // объявление сигнатуры метода
    boolean closeAccount();
    void blocking();
    void unBlocking();
    double depositInCash(int accountNumber, int amount);
    boolean withdraw(int accountNumber, int amount);
    boolean convert(double amount);
    boolean transfer(double amount);

}

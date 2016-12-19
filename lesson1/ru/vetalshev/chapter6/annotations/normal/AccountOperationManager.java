package ru.vetalshev.chapter6.annotations.normal;

public interface AccountOperationManager {

    double depositInCash(int accountNumber, int amount);

    boolean withdraw(int accountNumber, int amount);

    boolean convert(double amount);

    boolean transfer(int accountNumber, double amount);
}

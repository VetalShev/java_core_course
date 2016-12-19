package ru.vetalshev.chapter6.annotations.normal;

public class AccountOperationManagerImpl implements AccountOperationManager {
    @BankingAnnotation(securityLevel = SecurityLevelEnum.HIGH)
    public double depositInCash(int accountNumber, int amount) {
        // зачисление на депозит
        return 0;
    }

    @BankingAnnotation(securityLevel = SecurityLevelEnum.HIGH)
    public boolean withdraw(int accountNumber, int amount) {
        // снятие суммы, если не превышает остаток
        return true;
    }

    @BankingAnnotation(securityLevel = SecurityLevelEnum.LOW)
    public boolean convert(double amount) {
        // конвертировать сумму
        return true;
    }

    @BankingAnnotation
    public boolean transfer(int accountNumber, double amount) {
        // перевести сумму на счет
        return true;
    }
}
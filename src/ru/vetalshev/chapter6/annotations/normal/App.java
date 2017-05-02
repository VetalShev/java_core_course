package ru.vetalshev.chapter6.annotations.normal;

public class App {

    public static void main(String[] args) {
        AccountOperationManager account = new AccountOperationManagerImpl();

        // "регистрация класса" для включения аннотаций в обработку.
        AccountOperationManager securityAccount = SecurityFactory.createSecurityObject(account);
        securityAccount.depositInCash(10128336, 6);
        securityAccount.withdraw(64092376, 2);
        securityAccount.convert(200);
        securityAccount.transfer(64092376, 300);
    }
}

package ru.vetalshev.interfaces;

public interface AccountBaseAction {

    boolean openAccount();
    boolean closeAccount();
    void blocking();
    void unBlocking();

}

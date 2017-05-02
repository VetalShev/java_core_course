package ru.vetalshev.interfaces;

public class AccountBaseActionImpl implements AccountBaseAction {

    @Override
    public boolean openAccount() {
        return false;
    }

    @Override
    public boolean closeAccount() {
        return false;
    }

    @Override
    public void blocking() {

    }

    @Override
    public void unBlocking() {

    }
}

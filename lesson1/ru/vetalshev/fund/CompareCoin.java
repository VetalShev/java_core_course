package ru.vetalshev.fund;

import ru.vetalshev.fund.Coin;

public class CompareCoin {
    public void compareDiameter(Coin first, Coin second) {
        double delta = first.getDiameter() - second.getDiameter();
        if (delta > 0) {
            System.out.println("The first coin more the second one on " + delta);
        } else if (delta == 0) {
            System.out.println("Coins has the same diameter");
        } else {
            System.out.println("The second coin more the first one on " + -delta);
        }
    }
}
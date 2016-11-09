package ru.vetalshev.fund;

public class Coin {
    private double diameter; // правильная инкапсуляция
    private double weight; // правильная инкапсуляция

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double value) {
        if (value > 0) {
            diameter = value;
        } else {
            System.out.println("The input diameter is negative!");
        }
    }

    public double getWeight() { // правильное имя метода
        return weight;
    }

    public void setWeight(double value) {
        weight = value;
    }
}
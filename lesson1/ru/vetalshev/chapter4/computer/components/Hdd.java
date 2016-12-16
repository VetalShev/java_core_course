package ru.vetalshev.chapter4.computer.components;

public class Hdd extends Product {

    private String formFactor;
    private int volume;

    public Hdd() {
    }

    public Hdd(String code) {
        super(code);
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "formFactor='" + formFactor + '\'' +
                ", volume=" + volume +
                "} " + super.toString();
    }
}

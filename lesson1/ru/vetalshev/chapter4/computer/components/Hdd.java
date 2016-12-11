package ru.vetalshev.chapter4.computer.components;

public class Hdd extends Product {

    private String manufacturer;
    private String formFactor;
    private int volume;

    public Hdd(String code) {
        super(code);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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
                "manufacturer='" + manufacturer + '\'' +
                ", formFactor='" + formFactor + '\'' +
                ", volume=" + volume +
                '}';
    }
}

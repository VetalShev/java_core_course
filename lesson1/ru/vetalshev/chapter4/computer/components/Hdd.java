package ru.vetalshev.chapter4.computer.components;

public class Hdd {

    private int id;
    private String name;
    private String manufacturer;
    private String formFactor;
    private int volume;
    private float price;

    public Hdd() {}

    public Hdd(int id, String name, String manufacturer, String formFactor, int volume, float price) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.formFactor = formFactor;
        this.volume = volume;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", formFactor='" + formFactor + '\'' +
                ", volume=" + volume +
                ", price=" + price +
                '}';
    }
}

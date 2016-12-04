package ru.vetalshev.chapter4.computer.components;

public class CdRom {

    private String manufacturer;
    private String type;

    public CdRom() {

    }

    public CdRom(String manufacturer, String type, float price) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.price = price;
    }

    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

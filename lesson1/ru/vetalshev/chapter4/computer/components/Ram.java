package ru.vetalshev.chapter4.computer.components;

public class Ram {

    private int id;
    private int volume;
    private int frequency;
    private float voltage;
    private float price;
    private String type;
    private String formFactor;
    private String manufacturer;

    public Ram() {}

    public Ram(int id, int volume, int frequency, float voltage, float price, String type, String formFactor, String manufacturer) {
        this.id = id;
        this.volume = volume;
        this.frequency = frequency;
        this.voltage = voltage;
        this.price = price;
        this.type = type;
        this.formFactor = formFactor;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public float getVoltage() {
        return voltage;
    }

    public void setVoltage(float voltage) {
        this.voltage = voltage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "id=" + id +
                ", volume=" + volume +
                ", frequency=" + frequency +
                ", voltage=" + voltage +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", formFactor='" + formFactor + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}

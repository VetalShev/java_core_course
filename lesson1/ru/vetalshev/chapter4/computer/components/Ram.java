package ru.vetalshev.chapter4.computer.components;

public class Ram extends Product {

    private int volume;
    private int frequency;
    private float voltage;
    private String type;
    private String formFactor;
    private String manufacturer;

    public Ram(String code) {
        super(code);
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
                "formFactor='" + formFactor + '\'' +
                ", volume=" + volume +
                ", frequency=" + frequency +
                ", voltage=" + voltage +
                ", type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                "} " + super.toString();
    }
}

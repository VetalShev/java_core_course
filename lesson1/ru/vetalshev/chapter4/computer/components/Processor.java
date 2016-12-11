package ru.vetalshev.chapter4.computer.components;

public class Processor extends Product {

    private String manufacturer;
    private String cache;
    private int coresNumber;

    public Processor(String code) {
        super(code);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public int getCoresNumber() {
        return coresNumber;
    }

    public void setCoresNumber(int coresNumber) {
        this.coresNumber = coresNumber;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "manufacturer='" + manufacturer + '\'' +
                ", cache='" + cache + '\'' +
                ", coresNumber=" + coresNumber +
                '}';
    }
}

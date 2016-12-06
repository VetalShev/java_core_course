package ru.vetalshev.chapter4.computer.components;

public class CdRom {

    private int id;
    private String manufacturer;
    private String type;
    private float price;

    // если не создать данный конструктор - отсутсвует возможность создания локольной переменной типа CdRom c конструктором без параметров
    public CdRom() {} // нужен ли здесь этот конструктор ??? В каких стуациях он может быть нужен ???

    public CdRom(int id, String manufacturer, String type, float price) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.type = type;
        this.price = price;
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

    @Override
    public String toString() {
        return "CdRom{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CdRom cdRom = (CdRom) o;

        if (id != cdRom.id) return false;
        if (Float.compare(cdRom.price, price) != 0) return false;
        if (!manufacturer.equals(cdRom.manufacturer)) return false;
        return type.equals(cdRom.type);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + manufacturer.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        return result;
    }
}

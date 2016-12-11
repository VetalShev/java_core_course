package ru.vetalshev.chapter4.computer.components;

public class CdRom extends Product {

    public CdRom(String code) {
        super(code);
    }

    private String manufacturer;
    private String type;

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
                "manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CdRom)) return false;

        CdRom cdRom = (CdRom) o;

        if (!manufacturer.equals(cdRom.manufacturer)) return false;
        return type.equals(cdRom.type);

    }

    @Override
    public int hashCode() {
        int result = manufacturer.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }
}

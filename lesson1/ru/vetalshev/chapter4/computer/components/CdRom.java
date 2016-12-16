package ru.vetalshev.chapter4.computer.components;

public class CdRom extends Product {

    private String type;

    public CdRom() {
    }

    public CdRom(String code) {
        super(code);
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
                "type='" + type + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CdRom cdRom = (CdRom) o;

        return type != null ? type.equals(cdRom.type) : cdRom.type == null;

    }

    @Override
    public int hashCode() {
        return type != null ? type.hashCode() : 0;
    }
}

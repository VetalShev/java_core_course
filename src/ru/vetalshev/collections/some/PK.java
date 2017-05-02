package ru.vetalshev.collections.some;

public class PK {
    private String code;

    public PK(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PK pk = (PK) o;

        return code.equals(pk.code);

    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }
}

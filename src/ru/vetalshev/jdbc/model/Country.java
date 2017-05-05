package ru.vetalshev.jdbc.model;

public class Country extends Entity {

    private String name;

    public Country() {
    }

    public Country(String name) {
        this.name = name;
    }

    public Country(int id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + getId() +
                " name='" + name + '\'' +
                "}";
    }
}

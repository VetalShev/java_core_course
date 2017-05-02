package ru.vetalshev.collections.homework.model;

import java.util.HashMap;
import java.util.Map;

public class City {

    private int pk;
    private String name;
    private Map<Integer, Double> relatedCities = new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public Map<Integer, Double> getRelatedCities() {
        return relatedCities;
    }

    public void setRelatedCities(Map<Integer, Double> relatedCities) {
        this.relatedCities = relatedCities;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", pk=" + pk +
                ", relatedCities=" + relatedCities +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;

        City city = (City) o;

        if (pk != city.pk) return false;
        if (!name.equals(city.name)) return false;
        return relatedCities.equals(city.relatedCities);

    }

    @Override
    public int hashCode() {
        int result = pk;
        result = 31 * result + name.hashCode();
        result = 31 * result + relatedCities.hashCode();
        return result;
    }
}

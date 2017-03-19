package ru.vetalshev.collections.homework.model;

import ru.vetalshev.collections.homework.model.City;

import java.util.LinkedList;
import java.util.List;

public class Route {

    private List<City> cityList = new LinkedList<>();
    private boolean finished = false;
    private double distance = 0;

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "Route{" +
                "cityList=" + cityList +
                '}';
    }
}

package ru.vetalshev.collections.homework.service;

import ru.vetalshev.collections.homework.model.City;
import ru.vetalshev.collections.homework.model.Route;

import java.util.Map;
import java.util.Set;

public class RouteServiceImpl implements RouteService {

    @Override
    public Route findOptimalRoute(City from, City to) {

        if (to == from) {
            return null;
        }

        Map<Integer, Double> nearList = from.getRelatedCities();
        Set<Map.Entry<Integer, Double>> entry = nearList.entrySet();

        for (Map.Entry<Integer,Double> nearestCity : entry) {
            nearestCity.getKey();
            nearestCity.getValue();
        }

        return null;
    }
}


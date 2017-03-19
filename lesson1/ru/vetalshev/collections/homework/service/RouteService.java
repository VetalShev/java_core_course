package ru.vetalshev.collections.homework.service;

import ru.vetalshev.collections.homework.model.City;
import ru.vetalshev.collections.homework.model.Route;

public interface RouteService {

    Route findOptimalRoute(City from, City to);

}

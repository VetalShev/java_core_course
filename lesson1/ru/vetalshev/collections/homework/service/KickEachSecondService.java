package ru.vetalshev.collections.homework.service;

import java.util.List;

public interface KickEachSecondService<T> {

    List<T> start(List<T> list);

}

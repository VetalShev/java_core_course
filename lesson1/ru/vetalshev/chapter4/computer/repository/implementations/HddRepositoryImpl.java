package ru.vetalshev.chapter4.computer.repository.implementations;

import ru.vetalshev.chapter4.computer.components.Hdd;
import ru.vetalshev.chapter4.computer.repository.interfaces.HddRepository;

public class HddRepositoryImpl extends ProductRepositoryImpl<Hdd> implements HddRepository {

    public String getContentType() {
        return "Hdd";
    }

}

package ru.vetalshev.chapter4.computer.repository.implementations;

import ru.vetalshev.chapter4.computer.components.Hdd;
import ru.vetalshev.chapter4.computer.repository.interfaces.HddRepository;

import java.util.ArrayList;
import java.util.List;

public class HddRepositoryImpl extends ProductRepositoryImpl<Hdd> implements HddRepository {

    private List<Hdd> hddList = new ArrayList<>();

    public HddRepositoryImpl() {
        createList();
    }

    public List<Hdd> getHddList() {
        return hddList;
    }

    private void createList() {
        addItem(1, "Hitachi 500GB SATA 7200rpm", "Hitachi", "2.5\"", 512, 115);
        addItem(2, "Seagate Baracuda 500GB SATA 7200rpm", "Seagate", "3.5\"", 512, 90);
        addItem(3, "SAMSUNG 500GB SATA 7200rpm", "SAMSUNG", "2.5\"", 2048, 484);
        addItem(4, "SAMSUNG 7200rpm", "SAMSUNG", "2.5\"", 1024, 135);
        addItem(5, "Seagate Baracuda 7200rpm", "Seagate", "2.5\"", 512, 180);
    }

    private void addItem(int id, String name, String manufacturer, String formFactor, int volume, float price) {
        Hdd hdd = new Hdd(name);
        hddList.add(hdd);
    }

}

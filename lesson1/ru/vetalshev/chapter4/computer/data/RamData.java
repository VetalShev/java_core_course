package ru.vetalshev.chapter4.computer.data;

import ru.vetalshev.chapter4.computer.components.Ram;

import java.util.ArrayList;
import java.util.List;

public class RamData {

    private List<Ram> ramList = new ArrayList<>();

    public RamData() {
        createList();
    }

    public List<Ram> getRamList() {
        return ramList;
    }

    private void createList() {
        // почему обязательно следует писать символ "f" чтобы привести к float ??? [RESOLVED]
        addItem(1, 8192, 1600, 1.5f, 65, "SO-DIMM", "notebook", "Hitachi");
        addItem(2, 8192, 1600, 1.5f, 35, "SO-DIMM", "notebook", "Genius");
        addItem(3, 4096, 1600, 1.5f, 28, "SO-DIMM", "PC", "SAMSUNG");
    }

    private void addItem(int id, int volume, int frequency, float voltage, float price, String type, String formFactor, String manufacturer) {
        Ram cdRom = new Ram(id, volume, frequency, voltage, price, type, formFactor, manufacturer);
        ramList.add(cdRom);
    }
    
}

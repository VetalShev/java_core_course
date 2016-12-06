package ru.vetalshev.chapter4.computer.data;

import ru.vetalshev.chapter4.computer.components.CdRom;

import java.util.ArrayList;
import java.util.List;

// implement interface ComputerComponentData for all possible components???
public class CdRomData {

    private List<CdRom> cdRomList = new ArrayList<>();

    public CdRomData () {
        createList();
    }

    public List<CdRom> getCdRomList() {
        return cdRomList;
    }

    private void createList() {
        addItem(1, "Samsung", "DVD-RW", 152);
        addItem(2, "Samsung", "CD", 25);
        addItem(3, "Samsung", "DVD-R", 65);
        addItem(4, "ASUS", "DVD-RW", 84);
        addItem(5, "Acer", "DVD-RW", 70);
    }

    private void addItem(int id, String manufacturer, String type, float price) {
        CdRom cdRom = new CdRom(id, manufacturer, type, price);
        cdRomList.add(cdRom);
    }

}

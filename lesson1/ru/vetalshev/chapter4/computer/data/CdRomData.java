package ru.vetalshev.chapter4.computer.data;

import ru.vetalshev.chapter4.computer.components.CdRom;

import java.util.List;

public class CdRomData {

    private List<CdRom> cdRomList;

    public CdRomData () {
        createList();
    }

    public List<CdRom> getCdRomList() {
        return cdRomList;
    }

    private void createList() {
        addItem("Samsung", "DVD-RW", 152);
        addItem("Samsung", "CD", 25);
        addItem("Samsung", "DVD-R", 65);
    }

    private void addItem(String manufacturer, String type, float price) {
        CdRom cdRom = new CdRom(manufacturer, type, price);
        cdRomList.add(cdRom);
    }

}

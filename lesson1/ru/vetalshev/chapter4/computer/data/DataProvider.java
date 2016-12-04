package ru.vetalshev.chapter4.computer.data;

import ru.vetalshev.chapter4.computer.components.CdRom;
import ru.vetalshev.chapter4.computer.components.Hdd;
import ru.vetalshev.chapter4.computer.components.Processor;
import ru.vetalshev.chapter4.computer.components.Ram;

import ru.vetalshev.chapter4.computer.data.CdRomData;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    private CdRomData cdRomData = new CdRomData();

    public List<Hdd> getHddList() {
        List<Hdd> hddList = new ArrayList<>();

        return hddList;
    }

    public List<Processor> getProcessorList() {
        List<Processor> processors = new ArrayList<>();

        return processors;
    }

    public List<Ram> getRamList() {
        List<Ram> rams = new ArrayList<>();

        return rams;
    }

    public List<CdRom> getCdRomList() {
        return cdRomData.getCdRomList();
    }

}
